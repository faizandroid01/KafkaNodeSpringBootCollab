<!------------------------- Command to be entered ------------------------->

F:\Windows_Workspace\TechConnect_Workspace\POCs\KafkaNodeSpringBootCollab>npm init
This utility will walk you through creating a package.json file.
It only covers the most common items, and tries to guess sensible defaults.

See `npm help init` for definitive documentation on these fields
and exactly what they do.

Use `npm install <pkg>` afterwards to install a package and
save it as a dependency in the package.json file.

Press ^C at any time to quit.
package name: (kafkanodespringbootcollab) nodepoducerandwebsocket
version: (1.0.0)
description: node project acts as producer
entry point: (index.js)
test command:
git repository: (https://github.com/faizandroid01/KafkaNodeSpringBootCollab.git)
keywords:
author: Faiz Ahmed
license: (ISC)
About to write to F:\Windows_Workspace\TechConnect_Workspace\POCs\KafkaNodeSpringBootCollab\package.json:

{
  "name": "nodepoducerandwebsocket",
  "version": "1.0.0",
  "description": "node project acts as producer ",
  "main": "index.js",
  "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1"
  },
  "repository": {
    "type": "git",
    "url": "git+https://github.com/faizandroid01/KafkaNodeSpringBootCollab.git"
  },
  "author": "Faiz Ahmed",
  "license": "ISC",
  "bugs": {
    "url": "https://github.com/faizandroid01/KafkaNodeSpringBootCollab/issues"
  },
  "homepage": "https://github.com/faizandroid01/KafkaNodeSpringBootCollab#readme"
}


Is this OK? (yes)
npm notice
npm notice New minor version of npm available! 8.1.2 -> 8.4.1
npm notice Changelog: https://github.com/npm/cli/releases/tag/v8.4.1
npm notice Run npm install -g npm@8.4.1 to update!


<!------------------------- Command to be entered ------------------------->


** KAFKA JS used - https://www.npmjs.com/package/kafkajs 

command - npm install kafkajs

** start kafka = start zookeeper from kafka folder >> start broker >> hard code brokers from
in server.properties 

* starting zookeeper 
    - C:\kafka\bin\windows>zookeeper-server-start.bat ..\..\config\zookeeper.properties
* starting broker
    - C:\kafka\bin\windows>kafka-server-start.bat ..\..\config\server.properties  
* listening through kafka console consumer
    - C:\kafka\bin\windows>kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test-topic --from-beginning