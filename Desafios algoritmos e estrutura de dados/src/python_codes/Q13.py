#Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.


salario = float(input("qual o salario?")) #exibe uma mensagem, entra com o dado e salva na variavel tipo float
aumento = salario*15/100                  #chama a variavel salario e multiplica por 15%, armazena na variavel tipo float

print(f"o novo salário será de: {salario+aumento}") #chama a variavel aumento e salario e soma elas, exibe a mensagem