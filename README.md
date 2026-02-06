# NumberGame
NumberGame
🎮 NumberEscape: A Logic-Based CLI Game
NumberEscape is a high-stakes console-based logic game built with Java. Players must navigate through a field of randomized "traps" and a hidden "dead-hand" constant to achieve the highest escape score possible.

The project demonstrates core Java principles including Exception Handling, Thread Management, and Modular Game Logic.

🚀 Key Features
Dual Difficulty Modes: Choose between Easy (2 moving traps) and Hard (2 moving traps + 1 static "Dead-hand" trap).

Immersive CLI Experience: Features a custom Typewriter Effect for rules and storytelling using multi-threading delays.

Proximity Intelligence: The engine calculates your distance from traps and provides real-time feedback like "Just Missed" or "So Close".

Robust Error Handling: Built-in validation to prevent crashes from invalid string inputs or out-of-range numbers.

🛠️ Technical Stack
Language: Java (JDK 8 or higher)

APIs: java.util.Scanner, java.util.Random

Concepts: Static constants, Method modularization, Input Sanitization, Thread Sleep.


🕹️ How to Play
Clone the repository:
git clone https://github.com/Bobby-chirra/NumberGame.git

Compile the game:
javac numberGame.java

Run the game:
java numberGame
