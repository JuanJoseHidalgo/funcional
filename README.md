## Programación funcional
### Tratase de facer un programa realizado con bucles inicialmente, aproveitando as vantaxes da programación funcional
### Pódese apreciar a reducción no tamaño do código.
### Obxectivo:
#### 0000  0001  0004  0009  0016  0025  0036  0049  0064  0081  
#### 0100  0121  0144  0169  0196  0225  0256  0289  0324  0361  
#### 0400  0441  0484  0529  0576  0625  0676  0729  0784  0841  
#### 0900  0961  1024  1089  1156  1225  1296  1369  1444  1521  
#### 1600  1681  1764  1849  1936  2025  2116  2209  2304  2401  
#### 2500  2601  2704  2809  2916  3025  3136  3249  3364  3481  
#### 3600  3721  3844  3969  4096  4225  4356  4489  4624  4761  
#### 4900  5041  5184  5329  5476  5625  5776  5929  6084  6241  
#### 6400  6561  6724  6889  7056  7225  7396  7569  7744  7921  
#### 8100  8281  8464  8649  8836  9025  9216  9409  9604  9801 
### Versión inicial con bucles
fun main() {

    var cadrado=0
    var cadea=""
    var posicion=1

    for (numero in 0..99) {
        cadrado = numero * numero
        cadea=cadrado.toString()
        when {
            cadrado<10 -> cadea="000"+cadea
            cadrado<100 -> cadea="00"+cadea
            cadrado<1000 -> cadea="0"+cadea
        }
        print("$cadea  ")
        posicion++
        if (posicion==11) {
            println()
            posicion=1}
    }
}
### Versión final con programación funcional
fun main() {
    (0..99).chunked(10).forEach { chunk ->
        println(chunk.joinToString("  ") { String.format("%04d", it * it) })
    }
}
