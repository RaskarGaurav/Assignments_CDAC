#Step-wise Regression
MR1 <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-9_Correlation_Simple and Multiple Regression _Stepwise Regression/Regression_Simple and Multiple/Multiple Regression/MR1.xlsx")
attach(MR1)

#Step-wise Regression
Fitall <- lm(Buying~. , data = MR1)
Fitfirst <- lm(Buying~1, data = MR1)

#Backward Elimination
step(Fitall,direction = "backward")

#Forward Selection
step(Fitfirst,direction = "forward",scope = formula(Fitall))

Model2 <- lm(Buying~Attitude+Awarness+Perception+Cost, data = MR1)
summary(Model2)
