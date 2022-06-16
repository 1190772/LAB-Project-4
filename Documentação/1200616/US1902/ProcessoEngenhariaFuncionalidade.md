# US1902 - As Project Manager, I want the communications made through the SPOMS2022 protocol to be secured/protected.
=================================


# 1. Requisitos


*Nesta secção a equipa deve indicar a funcionalidade desenvolvida bem como descrever a sua interpretação sobre a mesma e sua correlação e/ou dependência de/com outros requisitos.*


Deve ser adotada a autenticação SSL/TLS baseada em certificados de chave publica.


Esta User Story tem como dependencia a US1901.


## 1.1. Questões Relevantes no fórum

> Sem questões no forum sobre esta User Story


# 2. Análise


*Neste secção a equipa deve relatar o estudo/análise/comparação que fez com o intuito de tomar as melhores opções de design para a funcionalidade bem como aplicar diagramas/artefactos de análise adequados.*

*Recomenda-se que organize este conteúdo por subsecções.*




# 3. Design

*Nesta secção a equipa deve descrever o design adotado para satisfazer a funcionalidade. Entre outros, a equipa deve apresentar diagrama(s) de realização da funcionalidade, diagrama(s) de classes, identificação de padrões aplicados e quais foram os principais testes especificados para validar a funcionalidade.*

*Para além das secções sugeridas, podem ser incluídas outras.*

| Trusted Store     | Keys Store Pass |
|:----------------- |:--------------- |
|myKeyStore.jks     |123456           |

## 3.1. Certificados

Os certificados foram gerados atraves destes scripts.

	keytool -genkey -keyalg RSA -keysize 2048 -validity 360 -alias mykey -keystore myKeyStore.jks

	keytool -export -alias mykey -keystore myKeyStore.jks -file mykey.cert

	keytool -import -file mykey.cert -alias mykey -keystore myTrustStore.jts



## 3.2. Padrões Aplicados

*Nesta secção deve apresentar e explicar quais e como foram os padrões de design aplicados e as melhores práticas.*


## 3.4. Testes 
*Nesta secção deve sistematizar como os testes foram concebidos para permitir uma correta aferição da satisfação dos requisitos.*

**Teste 1:** Verificar que não é possível criar uma instância da classe Exemplo com valores nulos.

	@Test(expected = IllegalArgumentException.class)
		public void ensureNullIsNotAllowed() {
		Exemplo instance = new Exemplo(null, null);
	}

# 4. Implementação

*Nesta secção a equipa deve providenciar, se necessário, algumas evidências de que a implementação está em conformidade com o design efetuado. Para além disso, deve mencionar/descrever a existência de outros ficheiros (e.g. de configuração) relevantes e destacar commits relevantes;*

*Recomenda-se que organize este conteúdo por subsecções.*

* Foi utilizado o **Protocolo de Comunicação SPOMS2022**.
* Foram utilizados **certificados** para que exista uma **comunicação segura** entre o servidor e o cliente.

# 5. Integração/Demonstração


Para demonstrar o servidor usaremos um PC como server e varios outros PC's como clients a aceder ao mesmo tempo. Logo não há um IP especifico.
Precisaremos da User Storie 1901 funcionais para efeitos de demonstração. 

# 6. Observações

*Nesta secção sugere-se que a equipa apresente uma perspetiva critica sobre o trabalho desenvolvido apontando, por exemplo, outras alternativas e ou trabalhos futuros relacionados.*



