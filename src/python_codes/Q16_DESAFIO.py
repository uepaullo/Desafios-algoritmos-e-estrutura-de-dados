#[DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule quantos dias de vida um fumante perderá e exiba o total em dias.

dias = int(input("quantos cigarros são fumados no seu dia? ")) #exibe uma mensagem, entra com o dado e salva na variavel tipo int
anos = int(input("a quantos anos você fuma? "))                #exibe uma mensagem, entra com o dado e salva na variavel tipo int

vida = 10*dias/(24*60)*(anos*365) #calcula o tempo de vida perdido em dias, armazena em uma variavel
print (f"{round(vida,2)} dias")   #exibe o tempo de vida perido em dias, com formatação duas casa decimais