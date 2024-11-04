#LAb3 Regression Dummy Coding
RAUDC <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Lab-3-Cases/RAUDC.xlsx")
attach(RAUDC)

#Dependent
str(RAUDC)
RAUDC$Gender <- as.factor(RAUDC$Gender)
str(RAUDC)

#Model Regeression Dummy Coding
Model <- lm(`Individual work performance`~. , data = RAUDC)
summary(Model)
