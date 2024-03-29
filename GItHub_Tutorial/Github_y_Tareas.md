# Manual de CONFIGURACIÓN y USO BASICO de GIT...
Se presenta un pequeño documento y tutorial para el uso de GIT para la carga de proyectos en GitHUB.com

## Requisitos 
* Tener una cuenta activa de GitHub, en caso de no tenerla, crearla en la página [github.com](https://github.com)
* Tener instalada alguna versión de GIT y GitBash( la terminal por defecto de GIT ), es caso de no tenerla, descargarla de la [página de GIT](https://git-scm.com/downloads), en mi caso tengo la versión 2.41, ahora mismo la versión más nueva creo que es la 2.44, no deberia de haber gran diferencia, instalenlo
* Al terminar esa instalación deben de tener uno o más programas con el siguiente icono...
  + ![git_logos](git_logos.png)

## Primeros pasos
* Abrán el que dice "Git Bash" y ubiquence en la carpeta en la que tienen su proyecto de Java
* Se pueden desplazar en ella con comandos de directorio de linux, como:
  + cd [NAME_DIR] 
  + cd ..         //Para Ir al directorio superior
  + Arrastrar la carpeta del proyecto desde el explorador de archivos a la terminal y ubicarse al principio e iniciar el comando con "cd [RUTA]"
  
### Inicialización de GIT en el proyecto
* Si ya estas ubicado en el directorio de del proyecto desde la terminal(revisar imagen), ejecutar el siguiente comando:
    >    git init 
    + ![git_init](git_init.png)
* Con eso se inicializará el directorio con las cosas necesarias, para llevar un control de GIT del proyecto
* Lo siguiente, será realizar el primer "COMMIT", para eso PRIMERO, hay que preparar los archivos que serán "commiteados"
* Desde la terminal, hay que ver que archivos están pendientes por agregar, ya sea porque es archivo NUEVO ó porque recien se modifico, estó se hace con "git status"
    >    git status
    + ![git_status](git_status.png)
    + 