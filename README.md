# Firma_EC_API
Componente derivado de FirmaEC destinado a funcionar del lado del servidor mediante Glassgish 4.1 para realizar y validar firmas electronicas en documentos PDF 
Este es un componente destinado ha ser usado en aplicaciones web, del lado del servidor , permite realizar y validar firmas electronicas en documentos PDF, 
ha sido desarrollado con el IDE de Netbeans y probado con GlassFish 4.1, funciona mediante petisiones JSON lo cual hace posible la comunicacion entre aplicaciones
desarrolladas en distintos entornos o lenguajes de programacion.Unicamente realiza firmas electronicas en formato P12 o PFX.
Ejemplos
Firmar Documentos PDF: 
Mediante Postman accedemos a la siguiente ruta local: http://localhost:8080/Firma_EC_API/APIREST/Firmarpdf
La ruta recibe los siguientes datos en formato JSON : Certificado de firma electronica(p12 o pfx), contraseña del certificado, archivo pdf a firmar, pagina del PDF en la
que se firmara(En caso de ser la pagina 0 automaticamente se firmara en la ultima hoja del PDF), ubicacion horizontal y vertical de la pagina donde se estampara la firma.
Ejemplo:

