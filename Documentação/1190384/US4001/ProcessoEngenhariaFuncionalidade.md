# US4001
=======================================
# AVG MANAGER

## Requirements

As Project Manager, I want that the "AGVManager" component supports properly, at request, the needs of the "BackOfficeApp" application as well as the needs the AGV digital twin.

## Analysis

Based on the discussion with the customer, we gathered the following extra information on this feature:

This use case is necessary to interface with agvs that the warehouse has in certain places of the warehouse to collect products.

The AVG Manager operate on a 24/7 time schedule.

The AVG Manager is able to communicate using sockets.

It must be used the provided application protocol (SPOMS2022).

It is suggested the adoptiong of concurrent mechanisms (e.g. threads) and state sharing between these mechanisms.

No new domain concepts are at play.

## Design

The main questions about this use case are:

- How to provide the remote capability?

- How does each party know each other, namely, how does the AVG MANAGER know about this service?

-It will be used the provided application protocol (SPOMS2022).

### Communication protocol

It must be used the provided application protocol (SPOMS2022).


| Field	     | Offset  (bytes) | Length (bytes) | Description                                                                                                                                                                                                                                                                                                                |
|------------|-----------------|----------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| VERSION    | 0               | 1              | SPOMSP message format version. This field is a single byte and shouldbe interpreted as an unsigned integer (0 to 255). The present message format version number is one.                                                                                                                                                   |
| CODE       | 1               | 1              | This field identifies the type of request or response. It should beinterpreted as an unsigned integer (0 to 255).                                                                                                                                                                                                          |
| D_LENGTH_1 | 2               | 1              | These two fields are used to specify the length in bytes of the DATAfield. Both these fields are to be interpreted as unsigned integer numbers (0 to 255). The length of the DATA field is to be calculated as follows: D_LENGTH_1 + 256 x D_LENGTH_2 The length of the DATA field may be zero, meaning it does not exist. |
| D_LENGTH_2 | 3               | 1              |                                                                                                                                                                                                                                                                                                                            |
| DATA       | 4               |                | Contains data to meet the specific needs of the participating applications.                                                                                                                                                                                                                                                |



The protocol will support some message types by defalut:
- COMMTEST
- DISCONN
- ACK

CODE 0 - MENSSAGE "COMMTEST" - Communications test request with no other effect on the server application than the response with a code two message (ACK). This request has no data.

CODE 1 - MENSSAGE "DISCONN" - End of session request. The server is supposed to respond with a code two message, afterwards both applications are expected to close the session (TCP connection). This request has no data.

CODE 2 - MENSSAGE "ACK" - Generic acknowledgment message. Used in response to requests with codes zero and one but may be used for other requests. This response has no data.

CODE 3 - MENSSAGE "BACKOFFICE" - Request a client connection BackOffice. This request has no data.

CODE 4 - MENSSAGE "AVGDIGITALTWIN" -  Request a client connection AVG DIGITAL TWIN. This request has no data.


##Other Mensages
#### GET_AVAILABLE_AGV

The GET_AVAILABLE_AVG (code 11) message has the following format

    GET_AVAILABLE_AVG

In response RETURN_AVAILABLE_AVG (code 12), the service will reply with response in the format:

    RETURN_AVAILABLE_AVG, «avgID» «avgID» «avgID» ...


#### ASSIGN_TASK_MANUAL

The ASSIGN_TASK_MANUAL (code 13) message has the following format:

    FORCE_TASK, «orderID» «avgID»

The response SEND_TASKID (code 14) is in the format:

    SEND_TASKID, «taskId»

#### SENDS_AVG_ID

The SENDS_AVG_ID (code 21) message has the following format:

    RECEPTION_TASK_COMPLETE, «avgID»

#### RECEPTION_AVG_STATUS

The RECEPTION_AVG_STATUS (code 22) message has the following format:

    RECEPTION_AVG_STATUS, «avgID» , «status»

Status can be FREE or BUSY

#### RECEPTION_TASK_COMPLETE

The RECEPTION_TASK_COMPLETE (code 23) message has the following format:

    RECEPTION_TASK_COMPLETE, «avgID» /// «taskID» /// FINISH

#### SENDS_PRODUCT_LOCATION_LIST

The SEDNS_TASK (code 24) message has the following format:

    SENDS_PRODUCT_LOCATION_LIST, «taskID» /// «avgID» /// «productLocation» /// «productLocation» /// «productLocation»,...

Each product location is divided as the following format:

    «aisleID» «rowID» «shelfID» /// «aisleID» «rowID» «shelfID» /// ....

### Use case realization

This responsability will be assigned to a new application (`AVG MANAGER`) since all the existing applications are for user interaction, while this one does not require user interaction.

There are multiple responsibilities at play that need to be distributed among the different objects, namely:
- server socket
- client connection handling (in a separate thread)
- inbound message parsing
- request execution
- outbound message construction

Regarding the execution itself, we will reuse as much as possible the existing controller.

We won't use any framework (e.g., Spring Boot) for this and will leverage regular socket support in java (_mainly because we want to learn java sockets and multi-threading_).

The server must be resilient to badly formed input as well as abrupt connection closing from the client.

![US4001_SSD](US4001_SSD.puml)


### Unit testing

N/A

### Manual testing

N/A