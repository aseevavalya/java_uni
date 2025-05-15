# Aufgaben A5 – Kiosksimulation mit Interfaces und Vererbung

Dieses Java-Projekt simuliert einen Kiosk, in dem verschiedene Produkte gekauft werden können – darunter Zeitungen und E-Book-Reader. Es zeigt den Einsatz von Schnittstellen, Klassenhierarchien und einfachen Geschäftsprozessen.

## Übersicht der Klassen

| Datei                | Beschreibung                                                                 |
|----------------------|------------------------------------------------------------------------------|
| `Main.java`          | Einstiegspunkt für das Programm                                               |
| `Kiosk.java`         | Verwaltung der verfügbaren Produkte                                           |
| `Kasse.java`         | Repräsentiert die Kasse bzw. Zahlungsabwicklung                               |
| `KioskInhalt.java`   | Aufzählung oder Sammlung der Produktarten                                     |
| `Kaufbar.java`       | Interface für alle kaufbaren Objekte                                          |
| `Elektronisch.java`  | Interface für elektronische Produkte                                          |
| `Zeitung.java`       | Klasse für eine Zeitung                                                       |
| `EBookReader.java`   | Klasse für ein elektronisches Lesegerät, das `Elektronisch` und `Kaufbar` implementiert |

## Kompilieren und Ausführen

```bash
javac *.java
java Main
```
