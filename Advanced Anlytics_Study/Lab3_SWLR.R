#Lab3 StepWise LR
SWLR <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Lab-3-Cases/SWLR.xlsx")
attach(SWLR)

str(SWLR)

#StepWise LR
Fitall <- lm(`Employee Engagement`~., data = SWLR)
Fitfirst <- lm(`Employee Engagement`~1,data = SWLR)

#Backward Elimination
step(Fitall,direction = "backward")

#forward Selection
step(Fitfirst,direction = "forward",scope = formula(Fitall))

#MLR
Model <- lm(`Employee Engagement`~`Motivation Score`+ `Experience in yrs`, data = SWLR)
summary(Model)
