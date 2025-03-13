#Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.

dinheiro = float(input("dinheiro: "))    #exibe uma mensagem, entra com o dado e salva na variavel tipo float
print (f"voce pode comprar {round(dinheiro/3.45, 2)} dolares com RS{dinheiro} ") #chama a variavel dinheiro, divide ela por 3.45, e arredonda ela para mostra duas casa decimais, exibe a mensagem