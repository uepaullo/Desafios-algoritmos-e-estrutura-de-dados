#Desenvolva uma lógica que leia os valores de A, B e C de uma equação do segundo grau e mostre o valor de Delta.


A = int(input("Valor de A")) #exibe uma mensagem, entra com o dado e salva na variavel tipo int
B = int(input("Valor de B")) #exibe uma mensagem, entra com o dado e salva na variavel tipo int
C = int(input("Valor de C")) #exibe uma mensagem, entra com o dado e salva na variavel tipo int
Delta = B**2-4*A*C           #chama as variaveis A B e C e armazena na variavel delta

print (Delta)   #exibe Delta
