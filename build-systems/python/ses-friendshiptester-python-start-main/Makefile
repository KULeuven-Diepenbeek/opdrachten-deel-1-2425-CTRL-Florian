SRCDIR = .
MODELDIR = ./model
BUILDDIR = ./build

TARGET = app.bin

compile:
	pyinstaller --onefile --name $(TARGET) ./app.py

clean:
	rm -rf $(BUILDDIR) dist/$(TARGET)

run:
	@echo "Running program with flags: $(ARGS)"
	./dist/$(TARGET) $(ARGS)
	
test:
	python3 ./app.py