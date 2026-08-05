# Implementación de un servidor HTTP seguro con Ktor

El sistema debe implementar un servidor HTTP que maneje solicitudes de usuarios autenticados. El servidor debe usar Ktor para el enrutamiento y manejo de solicitudes, Exposed ORM para interactuar con la base de datos y JWT para la autenticación de usuarios. El dominio es una plataforma de gestión de cuentas de usuario donde los usuarios pueden registrarse, iniciar sesión y acceder a sus datos personales. Los actores involucrados son el usuario, el servidor de autenticación y la base de datos de usuarios. El sistema debe asegurar que solo los usuarios autenticados puedan acceder a sus datos y que las solicitudes sean idempotentes para evitar duplicados. La latencia máxima aceptable para las solicitudes es de 500ms y el sistema debe manejar al menos 100 solicitudes por segundo.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | servidor HTTP con Ktor, Exposed ORM y JWT |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Gradle 8+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `gradle build` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración del servidor Ktor

**Objetivo:** Configurar un servidor Ktor básico que pueda manejar solicitudes HTTP.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Configura un proyecto Ktor y crea un enrutamiento básico que responda a una solicitud GET en la ruta '/ping' con un mensaje 'pong'.

**Entregable:** Proyecto Ktor con enrutamiento básico funcional.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que Ktor usa una estructura de enrutamiento basada en Kotlin.
- Prueba la configuración del servidor usando curl o Postman.

</details>

### Fase 2: Integración con Exposed ORM

**Objetivo:** Integrar Exposed ORM para interactuar con la base de datos de usuarios.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Configura Exposed ORM para conectarte a una base de datos SQLite en memoria. Crea una tabla de usuarios con campos para id, nombre, email y contraseña. Implementa una ruta POST en '/register' que registre un nuevo usuario en la base de datos.

**Entregable:** Servidor Ktor con Exposed ORM integrado y ruta de registro funcional.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que Exposed ORM usa una API de Kotlin para interactuar con la base de datos.
- Prueba la integración usando una herramienta como DB Browser for SQLite.

</details>

### Fase 3: Autenticación con JWT

**Objetivo:** Implementar autenticación de usuarios usando JWT.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa una ruta POST en '/login' que autentique a un usuario y devuelva un token JWT. Asegúrate de que el token incluya la información del usuario y tenga una duración de 1 hora. Modifica la ruta '/ping' para que requiera autenticación y solo responda si el token es válido.

**Entregable:** Servidor Ktor con autenticación JWT funcional y ruta de ping protegida.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que JWT es un estándar para tokens de autenticación que incluye información del usuario en forma de claims.
- Prueba la autenticación usando curl o Postman y verifica que la ruta protegida requiere un token válido.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es Ktor y para qué se usa en este reto?
- **paraQueSirve**: ¿Para qué sirve Exposed ORM en este reto?
- **comoSeUsa**: ¿Cómo se usa JWT para autenticar usuarios en este reto?
- **erroresComunes**: ¿Qué errores comunes puedes encontrar al integrar Exposed ORM y cómo los resolverías?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de la autenticación con JWT en este reto?

## Criterios de Evaluacion

- Configuración correcta del servidor Ktor.
- Integración exitosa de Exposed ORM con la base de datos.
- Implementación funcional de la autenticación con JWT.
- Protección de rutas con autenticación JWT.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
