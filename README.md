# Aplicativo de Bloco de Notas (NotesApp)

Este é um aplicativo de bloco de notas simples que permite ao usuário adicionar, pesquisar e excluir notas. O aplicativo foi desenvolvido utilizando a arquitetura MVVM, Clean Arquitecture e a biblioteca Room para persistência de dados.

# Funcionalidades
O aplicativo oferece as seguintes funcionalidades:

° Adicionar notas<br>
° Pesquisar notas utilizando um campo de busca<br>
° Excluir notas<br>

# Arquitetura e Bibliotecas

O aplicativo foi desenvolvido utilizando a arquitetura MVVM (Model-View-ViewModel). O padrão MVVM é uma variação do padrão MVC, que separa a lógica de apresentação da lógica de negócios.<br>
As seguintes bibliotecas foram utilizadas no desenvolvimento do aplicativo:


° Room: biblioteca de persistência de dados que fornece uma camada de abstração sobre o SQLite<br>
° ViewModel: biblioteca que permite que os dados sobrevivam a mudanças de configuração e evita vazamentos de memória<br>
° LiveData: biblioteca que fornece objetos observáveis que podem ser atualizados e notificar seus observadores quando há mudanças<br>
° RecyclerView: biblioteca que fornece um componente de interface do usuário para exibir grandes conjuntos de dados que podem ser rolados de forma eficiente<br>
° SearchView: biblioteca que fornece um componente de interface do usuário para pesquisar dados na lista de notas<br>

# Requisitos de Sistema

° Android 5.0 (Lollipop) ou superior

# Como usar o aplicativo

° Para adicionar uma nova nota, clique no botão "Adicionar" na parte inferior da tela principal, digite um título e uma descrição e, em seguida, clique em "Salvar".<br>
° Para pesquisar por uma nota existente, digite o texto da pesquisa na caixa de pesquisa na parte superior da tela principal.<br>
° Para excluir uma nota existente, deslize o item para a esquerda ou direita na lista de notas e clique no ícone de exclusão.<br>

# Conclusão
O aplicativo de bloco de notas é uma aplicação simples e útil para quem deseja registrar suas ideias. O uso da arquitetura MVVM e da biblioteca Room ajuda a manter o código organizado e fácil de entender. Espero que o aplicativo possa ser útil para você!

# Possíveis Modificações.
Seria interessante para fins de segurança das anotações colocar esse banco de dados de forma online com sub rotina mantendo as informações sempre salvas em nuvem para que caso seja necessário desisntalar ou trocar de aparelho, não perder suas anotações e suas ideis.

# Screenshots
![image](https://user-images.githubusercontent.com/51803873/219699311-b8828c83-db10-498e-a925-aad0fe5cab8c.png)
![image](https://user-images.githubusercontent.com/51803873/219699543-58ae0e75-c2a6-4fef-8af2-dd07f2b16321.png)
![image](https://user-images.githubusercontent.com/51803873/219699910-943f1521-ca79-4763-97ce-a2d3bd28efe6.png)
![image](https://user-images.githubusercontent.com/51803873/219700011-64339e31-d248-4f39-9ccb-cc4908926251.png)
![image](https://user-images.githubusercontent.com/51803873/219700074-c1b10bcb-4984-4e63-b6ac-aac6952428b2.png)
![image](https://user-images.githubusercontent.com/51803873/219700172-d0584629-5bd1-4ebf-ae92-c6bfab049024.png)


