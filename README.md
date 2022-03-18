# PRACTICA 4 

### 1. SUBIR FILES A REPOSITORIO MAIN
En primer lugar hemos de crear un **repositorio** de la siguiente manera: 
<img src="https://cdn.discordapp.com/attachments/954218673885823037/954218679900471347/unknown.png">

A continuación, procederemos a ejecutar los siguientes comandos :
1.    git init : para inizializar el empty git repository
2.    git remote add : para enlazarlo con el reposoitorio
3.    git branch : para crear una nueva rama
4.    git commit -m "" : para crear un nuevo commit
5.    git push : para subir al repositorio linkeado previamente
ADEMÁS HEMOS DE DISPONER DE UNA CLAVE SSH <a href = "https://docs.github.com/es/authentication/managing-commit-signature-verification">CLICK AQUÍ PARA INFO</a>

### 2. CREAR UNA RAMA NUEVA Y ACTUALIZAR LA VERSIÓN DE LA MASTER 
En primer lugar hemos de crear la rama *dev* con el comando indicado previamente (**git branch**), a continuación realizamos un **git add .** para preparar los archivos que queremos subir, nos movemos de rama con **git checkout**, creamos un commit nuevo con **git commit -m** el cual nos detectará que han habido cambios en el archivo y solo nos quedará hacer un **git push** para subirlo todo.
<img src = "https://media.discordapp.net/attachments/954218673885823037/954220038473252904/unknown.png">

### 3. REALIZAR 2 REFACTORIZACIONES
En primer lugar, hemos de realizar varios cambios en las files que queramos subir, en mi caso, he editado las interfaces y también la estructura del toString para hacer el código más eficiente.

Una vez tengamos el código cambiado, hacemos un **git add** al archivo específico que hemos cambiado y seguidamente, añadimos tanto un **git commit -m** como un **git push**
<img src = "https://media.discordapp.net/attachments/954218673885823037/954221263134527579/unknown.png">

### 4. ACTUALIZAR RAMA MASTER CON UNA NUEVA VERSIÓN ESTABLE

En primer lugar, nos movemos a la rama main empleando el comando **git checkout**, para actualizar la versión hemos de emplear **git merge**, a continuación haciendo un git log podemos confirmar que los commits de la rama actualizada, también aparecen en la actualizada, es decir se ha actualizado la versión correctamente y solo nos hará falta hacer un **git push**.
**En los merges no es necesario realizar un commit**
<img src="https://media.discordapp.net/attachments/954218673885823037/954222255133573180/unknown.png?width=900&height=670">

### 5. REALIZAR REFACTORIZACIONES EN UNA RAMA DESDE UNA VERSIÓN ANTERIOR

En primer lugar,nos dirigimos a la rama deseada con **git checkout**, a continuación, realizamos las refactorizaciones deseadas y empleamos un **git status** para ver si aparecen valores modificados, después, realizaremos un **git add** a los archivos a actualizar, agregamos un **commit** y realizamos un **git push** para subirlo todo
  

<img src="https://media.discordapp.net/attachments/954218673885823037/954223675182301184/unknown.png?width=718&height=670">

### 6. ACTUALIZAR RAMA MASTER

En primer lugar, nos dirigimos a la rama desada con **git checkout**,realizamos un **git merge**, a continuación, realizamos un **git log**, hacemos un **git status** para comprobar que todo está correcto, añadimos un **commit** y hacemos un **git push**
  
<img src = "https://media.discordapp.net/attachments/954218673885823037/954224372053323816/unknown.png?width=585&height=670">




