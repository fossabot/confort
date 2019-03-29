# Confort

> _Manage your configurations with comfort._

A configuration library based on nodes, trees and parsers generated from [ANTLR Grammars](https://www.antlr.org/).  

## Description
This library makes configuration easy by completely hiding away format specifications, loading and saving from its users.  
Registered loaders allow easy retrieval of the loader of the right format.
(E.g. ``LoaderRegistry.getLoader("application/json")``).  
  
Additionally, there are utility classes to hide away the type of storage. So no matter, where the configuration is actually loaded from, the calls will be the same.
  
Loaders can (but don't have to) be based on ANTLR grammars which are freely available [in the public repository](https://github.com/antlr/grammars-v4).  
Grammar for your format is not there? Don't give up! Writing ANTLR grammar is easy to learn.  

## Links

* Documentation: \<tbd\>
* Issues: https://gitlab.com/MarkL4YG/confort/issues
* Contact:  
  * [github@m-lessmann.de](mailto:github@m-lessmann.de)  
  * [ts.fearnixx.de](ts3server://ts.fearnixx.de)  
  * [Jeak-Framework Discord](https://discord.gg/DPYR5aB)
  
---
  
#### Buy me a coffe:
If you would like to thank me for my work, please consider donating a drink :)  

[![ko-fi](https://www.ko-fi.com/img/donate_sm.png)](https://ko-fi.com/F1F0OL0V)