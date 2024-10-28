#Two way ANOVA
Two_way_ANOVA <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-8_ANOVAs/Two Way ANOVA/Two_way_ANOVA.xlsx")
attach(Two_way_ANOVA)
str(Two_way_ANOVA)
Two_way_ANOVA$Place <- as.factor(Two_way_ANOVA$Place)
Two_way_ANOVA$Education <- as.factor(Two_way_ANOVA$Education)
str(Two_way_ANOVA)

#Homogenity
library(car)
leveneTest(Sales~Place, data = Two_way_ANOVA)
leveneTest(Sales~Education, data = Two_way_ANOVA)

#Two Way ANOVA
Model <- aov(Sales~Place+Education+Place*Education,data=Two_way_ANOVA)
summary(Model)
shapiro.test(Model$residuals)
model.tables(Model,"mean")

#Tukey Test
TukeyHSD(Model)
