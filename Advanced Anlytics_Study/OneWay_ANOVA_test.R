#One-way ANOVA
One_Way_Anova_CBSE <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-8_ANOVAs/One Way ANOVA/One_Way_Anova_ CBSE.xlsx")
attach(One_Way_Anova_CBSE)
str(One_Way_Anova_CBSE)
One_Way_Anova_CBSE$Graduation_Stream <- as.factor(One_Way_Anova_CBSE$Graduation_Stream) #Convert one variable into factor variable. 
str(One_Way_Anova_CBSE)
shapiro.test(Marks)

#Homogeneity Test (H0: Variance are equal)
library(car)
?leveneTest()
leveneTest(Marks~Graduation_Stream, data=One_Way_Anova_CBSE)

#One way ANOVA
Model<- aov(Marks~Graduation_Stream,data=One_Way_Anova_CBSE)
summary(Model)
shapiro.test(Model$residuals)

#Tukry Test
TukeyHSD(Model)

model.tables(Model,"mean")
?model.tables
