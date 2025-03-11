#Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, sabendo que cada litro de tinta pinta uma área de 2metros quadrados.


altura = int(input("qual a altura da parede: "))   #exibe uma mensagem, entra com o dado e salva na variavel tipo int
largura = int(input("qual a largura da parede: ")) #exibe uma mensagem, entra com o dado e salva na variavel tipo int

print(f"A area a ser pintada será de {altura*largura} metros quadrados, e a quantidade de tinta será de {(altura*largura)/2} litros") #multiplica a altura pela largura, aprenta o resultado, muitliplica a altura pela largura e divide por 2, exibe uma mensagem
