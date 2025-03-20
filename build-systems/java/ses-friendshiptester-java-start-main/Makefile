SRCDIR = .
MODELDIR = ./model
BUILDDIR = ./build

TARGET = app.jar

compile: $(SRCDIR)/App.java $(MODELDIR)/FriendshipTester.java
	@mkdir -p $(BUILDDIR)
	javac -d $(BUILDDIR) $(SRCDIR)/App.java $(MODELDIR)/FriendshipTester.java

jar: compile
	jar cvfe $(BUILDDIR)/$(TARGET) App -C $(BUILDDIR) .

run: jar
	@echo "Running program with flags: $(ARGS)" 
	java -jar $(BUILDDIR)/$(TARGET) $(ARGS)

clean:
	rm -rf $(BUILDDIR)/*.class $(BUILDDIR)/model $(BUILDDIR)/$(TARGET)