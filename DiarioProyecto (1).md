
DIARIO DEL PROYECTO NULLMOROSOS
------------------------------------
Mes de abril
------------------------------------
- He profundizado aun mas los conceptos mas importantes de Java8 entre ellos: Las interfaces, el polimorfismo o las clases abstractas....
- He decidido que para el proyecto se utilizara el programa de Eclipse IDE, junto al framework de Spring, el componente de Beans, la herramienta de gestión de Maven y por ultimo el servidor TomCat 9.
- Sobre el Eclipse he decidido usar la versión  2019-09 R (4.13.0). Es un modelo anterior a la nueva que es la de 2020.
- En en el apartado de Spring he decidido utilizar lo siguiente: 
    - Spring Core ( Para el uso de los Beans ) 
    - Spring Context ( Para imprimir el resultado que nos salga con la ayuda de los Beans)
  - Spring Boost ( Para configurar las aplicaciones web con mas sutura )
  - Spring MVC ( Una mejorar para configurar la aplicacion web)

- En este mes de Abril después de decidir como se jara el proyecto, me centro en aprender el uso de Spring Core, para el uso correcto de los Beans, apuntado varios detalles interesantes como:
   - Los beans en un principio se utilizaría a través de un archivo XML y con anotaciones (Este ultimo si fuera necesario)
  - De seguro que utilizara el método init, para iniciar algún método dentro del código fuente (Si fuera necesario) y un método destroyer, para destruir lo que hay dentro del método (Por ejemplo se podría utilizar para borrar la lista de morosos)
  - Se utilizara el metodo AutoWired para el autocableado de un metodo a otro a traves e los Beans (Por el archivo XML)
  - El método Required lo usaremos en el caso que queramos que ese método es obligatorio que se aplique en la aplicación (Por ejemplo el inicio de sesión, un usuario si no iniciar la sesión no podrá hacer nada dentro de la aplicación)
  - Si tenemos varios auto-wired lo podemos ordenar con el método beans de Primary
- Se ha realizado ejercicios secundarios que no tiene nada que ver con el proyecto para practicar lo que se ha estudiado este mes y que seguirá en el mes de Mayo.
- ---------------------------------
**MES MAYO**
- --------------------------------
- En este mes de Mayo hasta el dia 15 del mismo mes se ha estudiado las caracteristicas principales del Spring Boot y Spring MVC, lo que podemos descatar:
  - El estudio de una estructura que puede llevar una aplicacion gracias al Spring Boot. 
  - Los conceptos de Java EE
  - Los controladores que se usara mediante anotaciones (@Controller)
  - Las vistas o es lo mismo el diseño que tendra la aplicacion a traves de HTML y CSS
  - La creacion de de objetos para una clase y despues algunas formas como eliminar dicho objeto o modificarlo. Pero lo importante de esta leccion es la conexion que se hara con los controladores, todo esto con la anotacion @AutoWired
  - Spring security para un control de acceso de los usuarios
  - Spring Session para guardar los pasos que haga el usuario dentro de la aplicacion sin que tenga que esta pendiente.
  - Spring Data, la base de datos del Spring, lo mas importante todo, donde todo lo que hagamos tendra que ir a algun sitio donde se quedara guardado, se ha estudiado Hibernate, noSQL y H2 para seguir con los pasos que nos ha propuesto Spring Data, por ultimo todo esto se hara con JPA.
- Con esto queda finalizado el estudio realizados en estos dos ultimos meses, con la vigilancia del profesor de Programacion y sus detallados consejos.
------------------------------------------
**DIA A DE PROYECTO(16-05-2020)**
------------------------------------------
- Por ahora no se subira nada al Git (Por lo menos el dia de hoy) se centrara mas que nada en ¿Como vamos a hacer el proyecto? vamos a usar un poco la imaginacion antes de dar un paso en falso, si no es hoy mañana se empezara a subir poco a poco el proyecto. 

-----------------------------------------
**DIA B DE PROYECTO(16-05-2020-20-05-2020)**
-----------------------------------------

- Durante esos dias tras muchas horas delante del PC, terminado casi todos los trabajos de las demas asignaturas, me centro al 100x100 en el proyecto de programacion, un trabajo realmente dificil, porque me he metido con materias de segundo año, pero a la vez es algo positivo porque es un gran paso para un pequeño estudiante como yo, donde aprendere aun mas cosas que me puede venir muy bien en el futuro. La sabiduria y el esfuerzo es lo importante en esta materia y no la calidad.

- Con los apuntes del openwebinar que se ha dado durante esto dos meses, se ha creado ya el proyecto del NullMorosos (Una de muchas que han caido en el olvido en mi Eclipse), donde se ha creado las carpetas fundamentales para dirigir lo que este proyecto. Se ha creado las entidades, los repositorios, los metodos que se haran dentro del controller con la base de datos (Como es delete, new etc..) esto ha sido un trabajo de varios dias debido a varios expermientos que se ha hecho para mejorar el proyecto, entre añadirle un security a la aplicacion como añadirle otra base de datos mas complejas o un servidor mas dificil, que claramente no estoy en el nivel para ni tocar con las puntas de mis dedos.

-----------------------------------------------
**DIA C DE PROYECTO (21-05-2020)**
-----------------------------------------------

-Estaba super atascado, tenia todas las carpetas preparadas, mis base de datos encedida, pero faltaba una cosa y es ¿Como conectarla a la aplicacion? seguir los consejos de mi profesor de que habia alguna manera con el archivo properties, pero alguna razon o otra, o me hacia un drop cada vez que iniciaba la sesion o me daba fallos.. Ahi me di cuenta en el jardin que me habia metido queriendo usar REDIS Y H2 para realizar el proyecto, estaba metido totalmente en la boca del lobo y me quedaba pocoos dias.. Le pregunte a mi compañero de clase Berny, que tenia un proyecto de Spring y le pregunte como tenia la base de datos y me dijo con MySQL, a mi se me abrio los ojos no sabia que una base de datos tan facil y simple se podria conectar con un proyecto como Spring Boot. Asi que me puse a investigar y ¡VOILA! base de datos conectada con Mysql, todo a la perfeccion, pero me salia el error de se creaba y se borraba la base de datos ¿Por que? Estuve horas y horas de investigacion, preguntado, buscando por internet, hasta que di con la tecla... HIBERNATE, tenia un default de por si que hacia un drop y habia que ir a sus propiedades para que este sea solo Update (Solo actualizacion) todo marchaba sobre ruedas o eso pense....

-----------------------------------------------
**DIA D DE PROYECTO (22-05-2020)**
-----------------------------------------------
- Ese dia queria tomarlo como dia del diseño del proyecto, conectarla las paginas a sus respectivas urls del localhost, hacerle el diseño, las plantillas bien hechas por internet (Todavia no tengo el nivel suficiente para realizar una plantilla moderna, el profesor gabri y jorge me aconsejaron varias paginas web con plantillas) ya tenia hecha todas las plantillas, conectada a sus rrspectivas urls, pero faltaba el menu, lo mas dificil, me pegue horas y horas, sin exagerar casi 5 horas para buscar una plantilla con una tabla moderna, pero lo que encontraba o eran de pago o no se conectaba bien a mi aplicacion, asi que ya a la desesperada tve que usar mi imaginacion e ingenio y realizar mi propio menu desde 0 (El diseño es feisimo, pero lo que cuenta es el funcionamiento) con sus botones y demas, por ultimo acabe poniendo el formulario, me dio fallo la conexion del formulario, pero despues de investigar varias veces me di cuenta que el problema venia de los mappings asi que fue solucionado. Primer dia que acabe tan tarde, para comenzar otro dia temprano, me quedaba unos dias algo duros, pero roma no se hizo en dos dias.

---------------------------------------------------
**DIA E DE PROYECTO (23-05-2020)**
---------------------------------------------------
- Dia de pruebas con la base de datos, ya tenia hecho la base de datos, asi que con un CommandLine, hice varias pruebas con varios morosos y usuarios para comprobar la efectividad de la base de datos con la  aplicacion.. ¡FUNCIONABA! se creaba sus respectivas tablas y se quedaba guardada gracias al update del hibernate, asi que decidi hacer ya los metodos que hacian conectarse con el Thymeleaf de HTML donde el usuario trabajaria en verdad, HTML llamaria a los metodos y despues desde el controlador realizaba la accion.. ( Un ejemplo era registrar un usuario, etc..) ¿Pero que pasaba? yo las pruebas la realizaba desde la propia consola de la aplicacion pero no desde la propia web.. ME DABA FALLOS POR TODOS LADOS, YO NO SABBIA NI COMO EXPLOTO MI PC, PERO NO ME RENDI Y DECIDI SEGUIR INVESTIGANDO. tras horas y horas ya de noche, decido ya porque es por mi bien y porque pienso que ya he puesto muchas piedras en el horno, que llama a un BUEN amigo mio que es programador, que me ayudara a localizar el fallo que le estaba pasando.. asi que decidio conectarse a discord conmigo y ambos, como amigos e compañeros como si de un proyecto de empresa fuera, buscamos el fallo. Era los @Query anotacion que no me enseñaba en el curso del OpenWebminar y que lo que hacia era llamar a la base de datos, para que este por ejemplo a querer loguear un usuario, la aplicacion busque por la base de datos los atributos nick y contraseña y nada mas, si estaban en la base de datos entraba si no, no.. Ya ahi me di cuenta que estaba entrado en materia de segundo y me senti muy arrepentido, pero no agache y seguir para delante.. Mi amigo y yo decidimos llamar la base de datos a los metodos que yo habia conectado, pero otro fallo mas... ¿Que pasaba? estuvimos buscando el fallo, mi amigo ya decia que era imposible que buscara algun plan B de hacer el proyecto, pero de repente me acorde de los cursos del OpenWebinar y se me ilumino mi cabeza.. EL AUTOCABLEADO (Autowired).. ¿si no cableamos los controladores, con los repositorio y los metodo, como queremos llamarlo a la base de datos? te va a dar error y vacios etc... Asi que les puse la anotacion la anotacion @AutoWired a los repositorios y metodos.. Y FUNCIONO. Ya se podia manejar a la perfeccion los metodos, con los repositorio que llamaba a la base de datos. todo iba bien, asi que decidi dar la ultima pincelada mañana.

-------------------------------------------
PROYECTO F DE PROYECTO (24-05-2020)**
-------------------------------------------

- ULTIMO DIA. IBA TODO BIEN. ELIMINABA LOS MOROSOS, SE PODRIA REGISTRAR A LOS USUARIOS. TODO IBA DE MARAVILLA... pero.... Todos usuarios con todos los morosos, no habia un usuario para muchso morosos, si me onectaba con este usuario salia los morosos del otro usuario... ya eso si que no sabia que hacer ESTO ERA DE SEGUNDO AÑO. Asi que busque informacion por internet pero no entedia nada, era algo que estaba viendo por primera vez y encima en ingles...
Asi que le pedi una manita mas de mi amigo y bueno ahi fue cuando se enfando conmigo porque el termido de los serverts, los https, etc.. TODO ESO ES DE SEGUNDO, me habia metido en la boca de lobo y no me habia nada cuenta, la avaricia rompio el saco, pero entre los dos dimos con la solucion buscando informacion y explicandome para que servia, pero quitando ese punto malo, APRENDIR BASTANTE, YA SE COMO SERA EL CAMINO DE SEGUNDO Y YA TENGO UNOS CONOCIMIENTOS BASICOS... ya solo queda seguir hacia delante y seguir empanado de sabiduria, ya con los serverts preparado ya lo demas era algo mas normal, coloca los metodos de delete, save etc, con los repositorios guardado y ya solo quedaba mapearlos con la base de datos.. LISTO. se hizo los metodos mas importantes y hasta ultima hora no pare de hacer experimentos de mejoras añadiendo javascript, mas metodo mas especifico, como mostrar morosos de mayor a menor (En el proyecto te encontraras montones de comentarios mios de codigos fallidos o a medias, que lo he dejado ahi para modificarlo algun dia y conseguirlo!) 
Y con esto, me he dado cuenta QUE ME QUEDA MUCHO CAMINO y que todo es el comienzo, un trabajo muy duro por mi, que he tocado algo que no debia pero que le he echado valor, he aprendido tela y que se aprendera aun mas cosas, por mi bien y para ayudar a otros compañeros.


FIN
