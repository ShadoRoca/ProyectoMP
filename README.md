# ProyectoMP

RAMAS:

desarrollo1 - Rodrigo
desarrollo2 - Roberto
master - Rama final

-Una vez clonado el repositorio cambia a tu rama así:

git checkout desarrollo2

-Antes de empezar a editar sincroniza con master por si yo he subido algún cambio, para hacer esto es asi

git pull origin master

-Cuando hagas algun cambio haz lo siguiente

git status

-Esto te muestra los archivos que cambiaste, despues tienes que agregar los archivos que cambiaste

git add NombreArchivo #Esto significa que vas a subir tu version de el archivo NombreArchivo 

git add . #Esto "sube" todos los archivos que hayas modificado

-Si quieres confirmar que los archivos que vas a subir sean los que quieres puedes volver a hacer git status, deberian aparecer de color verde

-Despues tienes que hacer commit

git commit -m "mensaje" #mensaje es donde tienes que poner lo que cambiaste o modificaste

-Finalente haces push 

git push origin rama 

-En rama pones tu rama (desarrollo2) si aun no estas seguro de subir a master y si quieres subir a master, pones master

A trabajar *inserte meme de mr increible* xd
