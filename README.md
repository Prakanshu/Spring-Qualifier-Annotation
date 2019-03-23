# Spring-Qualifier-Annotation
Spring Qualifier Annotation with and without Annotation


Here i have created a branch without-qualifier-annotation to show the error if qualifier annotation is not being used.

When we run the code in branch without-qualifier-annotation ,it will throw the below error:-

***************************
APPLICATION FAILED TO START
***************************

Description:

Parameter 0 of constructor in guru.springframework.controllers.ConstructorInjectedController required a single bean, but 2 were found:
	- constructorGreetingService: defined in file [C:\Users\SONY\git\repository\di-demo\target\classes\guru\springframework\services\ConstructorGreetingService.class]
	- greetingServiceImpl: defined in file [C:\Users\SONY\git\repository\di-demo\target\classes\guru\springframework\services\GreetingServiceImpl.class]


Action:

Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed


The error suggest that since in our code , we have multiple implementation of GreetingService ,we need to specify the implementation to allow spring to create a specific bean
