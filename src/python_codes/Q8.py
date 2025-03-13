#Desenvolva um programa que leia uma distância em metros e mostre os valores relativos em outras medidas.

medidas = ["Km", "Hm","Dam", "Metros","Dm","Cm","Mm"]       #cria uma lista com as unidades de medidas
Metros = float(input("metros: "))           #exibe uma mensagem, armazena o dado na variável Metros
KM = Metros/1000                            #chama a varaivel Metros e divide ela por 1000 e armazena o resultado em KM
print ("A distancia corresponde em:")       #exibe uma mensagem
for i  in range(7):                 #cria um laço de repetição for que funcionará 7 vezes (quantidade de itens que tem em medidas)
    print(f"{medidas[0]}: {KM}")    #chama o primeiro intem da lista mediadas e chama  a variavel KM, exibe uma mensagem 
    KM = KM*10                      #multiplica o valor de KM por 10 para ser equivalente a proxima unidade de medida da lista medidas e reescreve a variavel KM
    medidas = medidas[1:]           #remove o primeiro item da lista medidas