# Game of Life – Zellulärer Automat in Java

Diese Java-Implementierung basiert auf dem berühmten zellulären Automaten „Game of Life“ von John Conway.  
Das Spiel simuliert die Evolution eines Zellrasters nach einfachen Regeln.

## Dateien

| Datei              | Beschreibung                                                   |
|--------------------|----------------------------------------------------------------|
| `GameOfLife.java`  | Hauptklasse mit Spiellogik und Steuerung der Zellzustände      |
| `MapView.java`     | Darstellung der Zellen (Text-basiert)                          |

## 🧠 Spielregeln (kurz)

Jede Zelle auf dem Raster hat zwei Zustände: **lebendig** oder **tot**.  
Bei jedem Schritt gelten folgende Regeln:

- Eine lebendige Zelle mit 2 oder 3 Nachbarn überlebt.
- Eine tote Zelle mit genau 3 Nachbarn wird lebendig.
- In allen anderen Fällen stirbt oder bleibt die Zelle tot.

## Kompilieren und Ausführen

```bash
javac GameOfLife.java MapView.java
java GameOfLife
```
