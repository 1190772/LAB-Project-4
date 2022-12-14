# US2005


# 1. Requirements engineering

### Brief format


The Warehouse Employee I want to open a web dashboard presenting the current status of the AGVs as well as their position in the warehouse layout and keeps updated automatically.
The system displays the web dashboard.
The Warehouse Employee confirms.
The system informs the Warehouse Employee about the success of the operation.


## 1.1. Relevant questions on the forum

> Q: - 1:It is mentioned that the warehouse is able to force a certain task to a certain AGV, but can this only happen when the AGV is free, or can the warehouse employee cancel a task and assign a new one.
> - 2:Despite in the provided sprint user stories asking for the digital twin in a web dashboard along with its status and position, in user stories of the next sprint it is said that the development of the movement of the AGV is needed which causes a minor confusion. My question is in this sprint is it required to create the movement of the AGV?
> - 3:How would you like the dashboard to look? A simple list of the AGVS along with its position and status?
> 
> A: - 1: In the scope of US 2003, the AGV is selected by the warehouse employee from the ones that are available and are able to perform the task. Tasks cannot be manually cancelled.
> - 2: On Sprint C, the web dashboard needs to be thought and ready to show the current AGVs position, which is read from some where. Further, on sprint D, when simulating the AGV movement the AGV position will change and, therefore, we will be able to see the AGVs position changing accordingly on the web dashboard. Notice that, this is an integrative project developed following an iterative and incremental process. So, at the end, the pieces need to fit well together.
> - 3: No! Preferably, the dashboard should be an approximation to what is depicted on Figure 8 of the specifications document.


>---
>
> Q: Regarding this US it is said that "It must be used the provided application protocol (SPOMS2022). The dashboard is intended to be displayed on a web page provided by an existing HTTP server in the ""BackOfficeApp"" application (...)". Our question is, between what applications should the SPOMS protocol be implemented? Should the HTTP server be part of the "BackOfficeApp" and communicate with the AGV Manager using the REQUESTS_API? Or should the HTTP server be its own application and communicate only with the "BackOfficeApp", which on the other hand communicates directly with the database?
>
> A: As it is being said the "HTTP Server" is part of the "Backoffice Application" in order to provide a local web page only. As so, the "HTTP Server" is a component of the "Backoffice Application". However, a question stands out: where the data to be presented by the "HTTP server" comes from? The "backoffice Application" (or one of its components) must, somehow, get the data from the "AGV Manager" (and/or the system database). In addition, you should notice that the SPOMS2002 protocol relies on the TCP and not on HTTP.
>


# 2. OO Analysis

*Neste sec????o a equipa deve relatar o estudo/an??lise/compara????o que fez com o intuito de tomar as melhores op????es de design para a funcionalidade bem como aplicar diagramas/artefactos de an??lise adequados.*

*Recomenda-se que organize este conte??do por subsec????es.*

## Excerpt from the Relevant Domain Model for US

![US2005_DM.png](US2005_DM.png)

## 2.1. System Sequence Diagram

![US2005_SSD](US2005_SSD.png)


# 3. Design - User Story Realization

*Nesta sec????o a equipa deve descrever o design adotado para satisfazer a funcionalidade. Entre outros, a equipa deve apresentar diagrama(s) de realiza????o da funcionalidade, diagrama(s) de classes, identifica????o de padr??es aplicados e quais foram os principais testes especificados para validar a funcionalidade.*

*Para al??m das sec????es sugeridas, podem ser inclu??das outras.*

## 3.1. Sequence Diagram

![US2005_SD](US2005_SD.png)

## 3.2. Class Diagram

![US2005_CD](US2005_CD.png)

## 3.3. Padr??es Aplicados

*Nesta sec????o deve apresentar e explicar quais e como foram os padr??es de design aplicados e as melhores pr??ticas.*

## 3.4. Tests 
*Nesta sec????o deve sistematizar como os testes foram concebidos para permitir uma correta aferi????o da satisfa????o dos requisitos.*

**Teste 1:** Verificar que n??o ?? poss??vel criar uma inst??ncia da classe Exemplo com valores nulos.

	@Test(expected = IllegalArgumentException.class)
		public void ensureNullIsNotAllowed() {
		Exemplo instance = new Exemplo(null, null);
	}

# 4. Implementa????o

*Nesta sec????o a equipa deve providenciar, se necess??rio, algumas evid??ncias de que a implementa????o est?? em conformidade com o design efetuado. Para al??m disso, deve mencionar/descrever a exist??ncia de outros ficheiros (e.g. de configura????o) relevantes e destacar commits relevantes;*

*Recomenda-se que organize este conte??do por subsec????es.*

# 5. Integra????o/Demonstra????o

*Nesta sec????o a equipa deve descrever os esfor??os realizados no sentido de integrar a funcionalidade desenvolvida com as restantes funcionalidades do sistema.*

# 6. Observa????es

*Nesta sec????o sugere-se que a equipa apresente uma perspetiva critica sobre o trabalho desenvolvido apontando, por exemplo, outras alternativas e ou trabalhos futuros relacionados.*



