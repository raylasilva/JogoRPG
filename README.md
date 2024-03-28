# JogoRPG


Crie um jogo de RPG simples em Java, onde o jogador interage com o sistema por
meio do console. Na classe principal JogoRPG, um objeto Jogo é criado e o método
iniciarJogo() é chamado para começar a execução do jogo. Dentro do método
iniciarJogo(), o jogador é solicitado a escolher entre duas classes de personagens:
Guerreiro ou Mago. Dependendo da escolha do jogador, uma instância adequada da
classe Jogador é criada (Guerreiro ou Mago).
Após a seleção da classe do jogador, uma batalha é iniciada contra um inimigo
representado pela classe Inimigo. Durante a batalha, o jogador e o inimigo alternam
ataques até que a vida de um deles chegue a zero. O jogo continua em um loop
enquanto ambos, jogador e inimigo, estão vivos. Após a batalha, uma mensagem é
exibida indicando se o jogador venceu ou foi derrotado, com base na vida restante
do jogador.
A lógica do jogo é baseada na orientação a objetos, onde cada entidade do jogo
(jogador, inimigo) é representada por uma classe com seus próprios atributos e
métodos. Isso permite uma fácil extensão do jogo com novas funcionalidades,
como adicionar mais classes de personagens, itens, habilidades especiais, entre
outros.

Detalhe das Classes (Não precisa necessariamente ser assim)
1. Classe JogoRPG:
a. Método main(String[] args): É o ponto de entrada do programa. Cria uma
instância da classe Jogo e inicia o jogo chamando o método
iniciarJogo().
2. Classe Jogo:
a. Atributos jogador e inimigo: Representam o jogador e o inimigo no jogo.
b. Método Jogo(): Construtor da classe que inicializa um jogador e um
inimigo.
c. Método iniciarJogo(): Controla o fluxo do jogo, permitindo que o jogador
escolha sua classe e inicie uma batalha contra um inimigo.

3. Classe Jogador:
a. Atributos vida e ataque: Representam a quantidade de vida e o poder
de ataque do jogador.
b. Método Jogador(): Construtor que inicializa os atributos do jogador.
c. Método atacar(Inimigo inimigo): Permite que o jogador ataque o inimigo,
reduzindo sua vida.
d. Método estaVivo(): Verifica se o jogador está vivo com base em sua
vida atual.

4. Classes Guerreiro e Mago (subclasses de Jogador):
a. Métodos Guerreiro() e Mago(): Construtores que inicializam os atributos
específicos de cada classe de jogador.

5. Classe Inimigo:
a. Atributos vida e ataque: Representam a quantidade de vida e o poder
de ataque do inimigo.
b. Método Inimigo(): Construtor que inicializa os atributos do inimigo.
c. Método atacar(Jogador jogador): Permite que o inimigo ataque o jogador,
reduzindo sua vida.
d. Método estaVivo(): Verifica se o inimigo está vivo com base em sua vida
atual.


*ideia* Bianca
menu: 

o jogador vai decidir, se quer ser guerreiro ou mago.
vamos imprimir o que cada um faz

print("escolha seu personagem")
("mago: ao usar poderes, perde mana, sendo seu total de mana 10")
("guerreiro: usa força, cada equipamento tem uma quantidade de força que era consumida para atacar, sendo seu total 10")

o jogador terá 10 de vida total, ele perde vida de acordo com o dano que é recebido do adversário

depois vão ter as rodadas 

rodadas:
*rodada jogador*
na rodada jogador, ele vai decidir se ele quer atacar ou defender
*rodada computador*
o computador vai decidir se vai atacar ou defender

logo após cada um decidir o que vai fazer em cada rodada, vão acontecer as jogadas 
ex1: se o jogador atacar e o computador defender, nenhum perde vida, mas perderão ataque ou mana
 ex2: se o jogador e o computador atacar os dois perdem vida (se a espada da 1 de dano, ele perde um coração
defender usa 2 de força
ataque usa 1 de força 
defesa mágica 2 de mana
ataque mágico 1 de mana
