#Template Method

Este padr�o � aplic�vel quando se deseja de!nir um algoritmo geral, que estabelece uma s�rie de passos para cumprir um requisito da aplica��o. Por�m, seus passos podem variar e � desej�vel que a estrutura da implementa��o forne�a uma forma para que eles sejam facilmente substitu�dos.

![Image of Yaktocat](hook.png)

Imagine, por exemplo, como seria se f�ssemos de!nir um algoritmo para as pessoas acordarem e irem ao trabalho. Esse algoritmo envolveria a��es como acordar, ir ao banheiro, comer alguma coisa, trocar de roupa e se locomover at� o trabalho. Dependendo da pessoa cada um dos passos pode ser diferente, como o tipo de roupa que colocam para ir ao trabalho ou o que comem pela manh�. Na locomo��o ao trabalho, alguns podem ir de transporte p�blico, outros podem ir em seu carro e at� mesmo a p� ou de bicicleta. Por mais que cada um dos passos seja diferente, o algoritmo que os utiliza acaba sendo o mesmo.

![Image of Yaktocat](hook2.png)

#Qual a diferen�a entre Hook Methods e o Template Method?

Muitas pessoas nesse ponto podem estar achando que Hook Methods e o padr�o **Template Method** s�o a mesma coisa. A grande diferen�a � que os Hook Methods s�o uma t�cnica para permitir a extens�o de comportamento e o **Template Method**, como um padr�o, � uma solu��o para um problema mais espec�!co. Seria correto dizer que o **Template Method** utiliza Hook Methods em sua solu��o. O que � importante perceber � que o conceito de Hook Method � mais geral e inclusive � utilizado por outros padr�es.
</br>
</br>
**REFER�NCIAS**
</br>
</br>
GUERRA Eduardo. **Design Patterns com Java:** Projeto orientado a objetos guiado por padr�es. S�o Paulo: Casa do C�digo, 2013.