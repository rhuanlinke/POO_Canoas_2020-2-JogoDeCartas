N2 pt2 (Disciplina de POO)

Criei os métodos abaixo:
- JogadorView.quantosJogadores = questiona quantos jogadores participarão, lê a quantidade definida e retorna para o controller.
- JogadorView.nomeJogador = só questiona qual o nome do jogador

Alterei os métodos abaixo:
- JogoController.JogoController = adicionei um for para que enquanto o nroJogadores for > 1, subtrair 1 dessa quantidade, e adicionar um novo jogador com o nome digitado no prompt.
- JogoController.preJogo = adicionei um while que irá dar as cartas para o número de jogadores definidos que foram definidos no método contrutor.
- JogadorView.mostraMao = retirei o scan deste método, a opção de interação do usuário com o "digite enter" estava gerando vários erros.
- JogadorView.escolheCartaDescartar = adicionei a linha 26 (resp--), pois sempre que eu digitava um número a ser descartado, era o número acima deste que era selecionado. Inclusive se selecionássemos o 10, o sistema verificava que não tinha nenhum acima dele, e gerava o erro mencionado abaixo.

Erros:
1. Sempre que tento que descartar a carta de nro 10, ocorre o erro abaixo:
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 10 out of bounds for length 10
- RESOLVIDO, adicionando o -1 junto ao scan de qual carta descartar.

2. Após as alterações no método construtor do JogoController, passei a receber a seguinte mensagem quando tento interagir com "Enter" após o preJogo:
Exception in thread "main" 
- RESOLVIDO, retirando o scan do JogadorView.mostraMao.
