SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE Calculate_Area (
    radius IN NUMBER,
    area OUT NUMBER
)
IS
BEGIN
    area := 3.14159 * radius * radius;
END;
/
