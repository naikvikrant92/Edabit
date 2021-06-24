def calc_age(years):
    print("Years entered: ", years)
    print('Age %d converted in days is equal to:%d' % (years,years*365))
    return years*365


calc_age(65)