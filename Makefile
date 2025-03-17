SRC_DIR = src/main/java
TARGET_DIR = target/classes
PACKAGE_DIR = br/pucrs
PACKAGE = br.pucrs

all: compile run

compile:
	@echo "Compiling Java files..."
	@mkdir -p $(TARGET_DIR)
	@javac -d $(TARGET_DIR) $(SRC_DIR)/$(PACKAGE_DIR)/*.java

run:
	@echo "Running Application..."
	@java -cp $(TARGET_DIR) $(PACKAGE).App

clean:
	@echo "Cleaning compiled files..."
	@rm -rf $(TARGET_DIR)/$(PACKAGE_DIR)/*.class