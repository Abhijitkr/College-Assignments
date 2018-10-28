import math
side=float(input('Enter the Side of the Triangle: '))
area=(math.sqrt(3)/4)*(side*side)
perimeter=3*side
semi_perimeter=perimeter/2
altitude=(math.sqrt(3)/2)*side
print('Area= ',area,'\nPerimeter= ',perimeter,'\nSemi Peremeter= ',semi_perimeter,'\nAltitude=',altitude)
