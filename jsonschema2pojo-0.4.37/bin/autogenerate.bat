@echo off
REM java -jar "%~dp0/../lib/jsonschema2pojo-cli-0.4.37.jar" -s *.txt -t generated -a JACKSON2 -T JSON -c3 -R -sl
java -jar "%~dp0/../lib/jsonschema2pojo-cli-0.4.37.jar" -s *.txt -t generated -a JACKSON2 -T JSON -c3 -E -S -R -pl -D