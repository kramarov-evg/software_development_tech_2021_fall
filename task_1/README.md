# Task 1
In this task we were supposed to program an artificial environment. There are 3 types of inhabitants in this environment:
- Wolves;
- Rabbits;
- Plants

Naturally, wolves eat rabbits, rabbits eat plants, plants grow randomly. Animals can move and spend energy for movements.

By the time this commit was made, we stopped on the moment, where we created basic classes for wolves, rabbits, plants and a field (it represents an environment they all live in). The task is to demonstrate thee code working.

***Below is the guide on how to achieve that, starting from the very beginning***


# How to setup Java and run project from 1st lesson
## Contents
If you already have some of these installed/set-up, you can skip those and jump straight into action.
1. Install Java
2. Install IDE
3. Get code
4. Run project

## Install Java
First of all you need a Java JDK (stands for Java Development Kit). It includes Java compiler, standard library and JRE (Java Runtime Environment). In short, JDK is a kit for development on Java, JRE is the runtime environment, where Java program is executed.

Personally I'd recommend using JDK version 11. It's the latest widely supported version. Actually the latest version is 17th, but 11th is the one, 99% of all apps will support.

### Windows
1. Go to official website download page and download .exe file
1. After running the installer, remember or write down the path where Java will be installed. It will be later reffered to as `java_path`
1. Install Java
1. Press `Win + r`
1. Type in `SystemPropertiesAdvanced` and hit `Enter`
1. Edit `Path` variable for your current user, by adding `java_path`+`\bin` to it (refer to the screenshot)
1. Hit `Apply` or `Save`
1. Press `Win + r` once again
1. Type in `cmd` and hit `Enter`
1. In the newly opened window type `javac --version`. If the output is similar to the screenshot below, you're all set up with Java.
