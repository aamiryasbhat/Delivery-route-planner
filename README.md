# Delivery Route Planner

## 🚀 Overview
The Delivery Route Planner is a Java-based application designed to optimize delivery routes for a delivery agent. It calculates the best route considering multiple destinations, including restaurants and customer locations, ensuring the most efficient use of time and resources. By leveraging Haversine's formula for distance calculations, the app accurately estimates travel times and optimizes routes for efficiency.

## 🛠 Technologies Used
- **Java**: The core language used for implementing the business logic and route optimization.
- **Haversine Formula**: Used to calculate the great-circle distance between two points on the Earth's surface, based on their latitudes and longitudes.
- **Mathematical Algorithms**: Applied to optimize the travel time considering preparation times at restaurants.

## 💻 Installation & Setup

### Prerequisites
- **Java 11+** installed.
- A preferred **IDE** (Eclipse, IntelliJ IDEA, or Visual Studio Code).
- **Git** installed for version control (optional).

### Steps to Install:
1. **Clone the repository**:
   Open a terminal and run the following command to clone the project:
   ```bash
   git clone https://github.com/aamiryasbhat/Delivery-route-planner.git
Navigate to the project directory:
cd Delivery-route-planner
Import the project into your IDE: Open the Delivery-route-planner directory in your preferred Java IDE (Eclipse, IntelliJ, etc.).

Compile and Run: The main entry point is the DeliveryRouteApp.java file, located in the main package. Run this file to execute the program.

javac main/DeliveryRouteApp.java
java main.DeliveryRouteApp
View the Output: After running the program, it will output the best route and the total estimated delivery time in the console.

