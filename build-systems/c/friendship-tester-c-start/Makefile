SRCDIR = ./src
BUILDDIR = ./build

TARGET = friendshiptester.bin

compile: 
	gcc -c $(SRCDIR)/main.c -o $(BUILDDIR)/main.o
	gcc -c $(SRCDIR)/friendshiptester.c -o $(BUILDDIR)/friendshiptester.o
	gcc -o $(TARGET) $(BUILDDIR)/main.o $(BUILDDIR)/friendshiptester.o


$(BUILDDIR)/%.o: $(SRCDIR)/%.c
	gcc -c $< -o $@

clean:
	rm -rf $(TARGET) $(BUILDDIR)/*

run: 
	@echo "Running program with flags: $(ARGS)" 
	./$(TARGET) $(ARGS)
