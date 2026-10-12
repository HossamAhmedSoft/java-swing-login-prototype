# Java Swing Authentication GUI Prototype

![Java](https://img.shields.io/badge/Language-Java%20SE-ED8B00?logo=openjdk&logoColor=white)
![UI](https://img.shields.io/badge/UI-Java%20Swing%20%2F%20AWT-blue)
![Build](https://img.shields.io/badge/Build-Apache%20Ant%20%2F%20NetBeans-E05D44)
![License](https://img.shields.io/badge/License-MIT-green)

A lightweight Java desktop graphical user interface (GUI) prototype demonstrating authentication form controls, event dispatching thread (`EventQueue.invokeLater`), and action listeners utilizing **Java Swing** and **AWT**.

---

## Technical Overview

- **Window Management:** Uses `JFrame` configured with standard window lifecycle handlers (`EXIT_ON_CLOSE`) and bounds configuration.
- **Form Controls:** Utilizes `JTextField` for email input, `JPasswordField` for secure masked credential capture, and `JButton` for action triggers.
- **Event Handling:** Implements `ActionListener` callbacks bound to user authentication actions.
- **Thread Safety:** Adheres to Swing threading best practices by instantiating the UI hierarchy on the Event Dispatch Thread (EDT).

---

## Project Structure

```
java-swing-login-prototype/
├── src/
│   └── screanswing/
│       └── LoginScreenSwing.java   # Swing form initialization & event listeners
├── build.xml                       # Apache Ant build script
└── nbproject/                      # NetBeans project configuration
```

---

## Compilation & Execution

```bash
# Compile
javac -d bin src/screanswing/LoginScreenSwing.java

# Run GUI
java -cp bin screanswing.LoginScreenSwing
```

---

## Author & License

- **Developer:** Hossam Ahmed ([@KabtinBandar](https://github.com/KabtinBandar))
- **License:** MIT
