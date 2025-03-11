#A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.

 
dias = int(input("por quantos dias vc ficou com o carro?: ")) #exibe uma mensagem, entra com o dado e salva na variavel tipo int
km = float(input("quantos KM foram rodados?:"))               #exibe uma mensagem, entra com o dado e salva na variavel tipo float

print (f"o preço total será de {dias*90+km*0.2}")            #chama a varialvel dias, multiplica por 90, chama a variavel km e multiplica por 0.2 e soma elas, exibe uma mensagem
