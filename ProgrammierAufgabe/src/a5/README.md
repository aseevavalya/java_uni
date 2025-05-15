# Aufgaben A5 – Vererbung und Polymorphismus mit Tieren

Dieses Projekt modelliert verschiedene Tierarten und ihr Verhalten mithilfe objektorientierter Konzepte wie Vererbung, Interfaces und Polymorphismus.

## Übersicht der Klassen

| Datei                      | Beschreibung                                                    |
|----------------------------|-----------------------------------------------------------------|
| `Tier.java`                | Abstrakte Basisklasse für Tiere                                 |
| `Elephant.java`            | Klasse für einen generischen Elefanten                          |
| `AfrikanischerElephant.java` | Spezialisierter Elefant mit eigenem Verhalten                  |
| `Tiger.java`               | Klasse für Tiger mit spezifischem Verhalten                     |
| `Wolf.java`                | Klasse für Wölfe                                                |
| `Heulen.java`, `Bruellen.java`, `Troeten.java` | Klassen oder Interfaces zur Beschreibung des Tierverhaltens (z. B. Lautäußerung) |
| `Schreiverhalten.java`     | Schnittstelle oder abstraktes Verhalten für "Schreie"          |
| `Zoo.java`                 | Hauptklasse, in der verschiedene Tiere verwaltet und ausgeführt werden |

## Kompilieren und Ausführen

```bash
javac *.java
java Zoo
```
