'''You are counting points for a basketball game, given the amount of 3-pointers scored and 2-pointers scored,
find the final points for the team and return that value ([2 -pointers scored, 3-pointers scored]).'''

def points(twopointers,threepointers):
    twoPointersTotal=twopointers*2
    threePointersTotal=threepointers*3
    totalPointsScored=twoPointersTotal+threePointersTotal
    print('Total points scored:', totalPointsScored)
    return totalPointsScored


points(7,5)