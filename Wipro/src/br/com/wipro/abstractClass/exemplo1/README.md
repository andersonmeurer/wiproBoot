#Hook Methods

Um importante uso que pode ser feito da heran�a � para permitir a especializa��o de comportamento. Dessa forma, a superclasse pode fornecer uma base para uma determinada funcionalidade, a qual invoca um m�todo que somente � de!nido pela superclasse. Esse m�todo funciona como um ponto de extens�o do sistema � chamado de m�todo-gancho, ou em ingl�s, **hook method**.

A superclasse possui um m�todo principal p�blico que � invocado pelos seus clientes. Esse m�-
todo delega parte de sua execu��o para o hook method, que � um m�todo abstrato que deve ser implementado pela subclasse. Ele funciona como um �gancho� no qual uma nova l�gica de execu��o para a classe pode ser �pendurada�. Cada subclasse o implementa provendo uma l�gica diferente. Como essa l�gica pode ser invocada a partir do mesmo m�todo p�blico, de!nido na superclasse, os hook methods permitem que o objeto possua um comportamento diferente de acordo com a subclasse instanciada.

![Image of Yaktocat](hook.png)

Essa pr�tica � muito utilizada em frameworks para permitir que as aplica��es possam especializar seu comportamento para seus requisitos.

A aplica��o deve estender essa classe e implementar o hook method de forma a inserir o comportamento espec�fco de seu dom�nio.


**REFER�NCIAS**
</br>
</br>
GUERRA Eduardo. **Design Patterns com Java:** Projeto orientado a objetos guiado por padr�es. S�o Paulo: Casa do C�digo, 2013.