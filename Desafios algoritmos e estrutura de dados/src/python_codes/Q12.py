#Crie um programa que leia o preço de um produto, calcule e mostre o seu PREÇO PROMOCIONAL, com 5% de desconto.

item = float(input("qual o valor do item?"))
desconto = item*5/100
print(f"o valor do item fica em torno de: {item-desconto}")