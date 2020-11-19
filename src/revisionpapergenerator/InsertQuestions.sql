/**
 * Author:  14MEvans
 * Created: 17-Nov-2020
 */



INSERT INTO tblForces(Difficulty, Marks, Wording, GenAnswer, MarkScheme, ExamBoard) VALUES (
    'Medium',
    3,
    'The cable on both sides of the car is at an angle of {1, 45}° to the horizontal. The radius of the
    cable is {1.0,3.0} × 10^–2 m. The stress in the cable is {1,9} × 10^7 Pa. The Young modulus of the material
    of the cable is {1.0,5.0} × 10^11 Pa. Calculate the strain experienced by the cable.',
    'list[2] * Math.pow(10,7)/list[3] * Math.pow(10,11)',
    'Strain = {list[2]} x 10^7 / {list[3]} x 10^11 \n Strain = {ANS}',
    'OCR;AQA'
);  

INSERT INTO TBLFORCES (DIFFICULTY, MARKS, WORDING, GENANSWER, MARKSCHEME, EXAMBOARD) VALUES (
    'Easy', 
    2, 
    'A block of concrete rests on the ground, The concrete block is {2,20} m long, {0.1,1} m wide and {0.6,2} m
     high. The density of concrete is {1000, 5000}kg m^–3. Calculate the weight of the concrete', 
    '9.81*((list[0]*list[1]*list[2])*list[3])', 
    'mass = {list[3]} x {list[0]} x {list[1]} x {list[2]} = {(list[0]*list[1]*list[2])*list[3]}
    weight = (list[0]*list[1]*list[2])*list[3] x 9.81
    weight = {ANS}', 
    'OCR'
);

INSERT INTO TBLSUVAT (DIFFICULTY, MARKS, WORDING, GENANSWER, MARKSCHEME, EXAMBOARD) VALUES (
    'Easy',
    1, 
    'A car of mass {700,1200} kg is travelling at {10,20} m/s along a horizontal road. A constant braking
    force of {2500, 5000} N brings it to rest. Calculate the deceleration of the car.', 
    'list[2]/list[0]', 
    'a = {list[2]}/{list[0]} \na = {ANS}', 
    'OCR'
);

INSERT INTO TBLSUVAT (DIFFICULTY, MARKS, WORDING, GENANSWER, MARKSCHEME, EXAMBOARD) VALUES (
    'Medium',
    3,
    'A car of mass {700,1200} kg is travelling at {10,20} m/s along a horizontal road. A constant 
    braking force of {2500, 5000} N brings it to rest. Calculate the distance travelled by the car during
     the deceleration.', 
    '(0.5*list[0]*(list[1]*list[1]))/list[2]',
    'v^2 = u^2 + 2as \n s = {list[1]*list[1]}/{(list[2]/list[0]} \n s = {ANS}',
    'OCR'
);

INSERT INTO TBLSUVAT (DIFFICULTY, MARKS, WORDING, GENANSWER, MARKSCHEME, EXAMBOARD) VALUES (
    'Hard',
    2,
    'A super-tanker cruising at an initial velocity of {2,10} m/s takes {20,90} minutes to come to a stop. 
    The super-tanker has a constant deceleration. Calculate the magnitude of the deceleration.', 
    '{0 - list[0])/(list[1]*60)',
    'a = (v - u)/t \na = 0 - {list[0]} / {list[1] x 60 \na = {ANS}',
    'OCR'
);
