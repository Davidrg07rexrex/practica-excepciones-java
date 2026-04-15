/*Después de mirar la documentación de Oracle sobre la serialización nativa y de probarla un poco, la verdad es que se notan un montón de diferencias con lo que hemos estado haciendo con JSON y Gson.

Lo primero que salta a la vista es que el archivo que genera la serialización de Java es binario, o sea, si lo abres con el bloc de notas ves un montón de caracteres raros. En cambio el JSON es texto normal, lo abres y entiendes lo que pone. Eso ya es una ventaja enorme porque puedes comprobar si los datos están bien o incluso modificar algo a mano sin tener que ejecutar el programa.

Otra cosa importante es que el archivo .ser que crea Java solo lo entiende Java. Si tuvieras que mandarle esos datos a un programa hecho en Python o a una web, olvídate. Con JSON eso no pasa, prácticamente cualquier lenguaje sabe leer JSON hoy en día.

Además, para que una clase se pueda serializar en Java necesitas ponerle el implements Serializable sí o sí, y también se recomienda meter el serialVersionUID para no tener problemas si cambias la clase más adelante. Con Gson no hay que tocar la clase para nada, él solo accede a los atributos usando reflexión.

También he visto que la serialización de Java es más delicada con los cambios en el código. Si guardas un objeto y luego añades un campo nuevo a la clase, al leer el archivo antiguo te puede saltar una excepción. Gson es más permisivo: si falta algún campo en el JSON simplemente lo deja con el valor por defecto y sigue leyendo lo demás.

Por último, he leído por ahí que lo de la serialización nativa ha tenido problemas de seguridad bastante gordos, de esos que permiten ejecutar código malicioso al leer un archivo. Vamos, que no es muy recomendable usarla con datos que te vengan de fuera. Con JSON ese riesgo no desaparece del todo, pero al menos el formato al ser texto es más controlable.

En fin, que después de ver las dos opciones, me quedo con JSON y Gson sin dudarlo. Es más práctico, más claro y no te ata a Java para siempre.

*/

