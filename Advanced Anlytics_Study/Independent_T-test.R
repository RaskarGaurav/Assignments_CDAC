#Independent Sample t-test
PerceptionJeans <- read_excel("D:/248518_Bkp/Advance Analytics-2024/Day-7_T-tests/T-tests/independent_t.xlsx")
attach(PerceptionJeans)
str(PerceptionJeans)

#Assumtions
#1)Dependent variable should be continuous

PerceptionJeans$City <- as.factor(PerceptionJeans$City) # Convert Chr into factor
str(PerceptionJeans)

#Normality test
shapiro.test(PerceptionJeans$Perception)
hist(Perception)

#Independent sample t-test
t.test(Perception~City, data=PerceptionJeans)
4.677419-3.838710 # Mean Differnce given in Confidence Interval
