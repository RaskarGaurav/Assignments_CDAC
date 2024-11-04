#Exploratory Factor Analysis
Factor_Analysis_Delta_Cars <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-11_EFA & Cluster Analysis/EFA/Factor Analysis_Delta Cars.xlsx")
attach(Factor_Analysis_Delta_Cars)
r=cor(Factor_Analysis_Delta_Cars)
r

library(psych)
#assumptions
str(Factor_Analysis_Delta_Cars)
KMO(r)
cortest.bartlett(r)

#OR

library(REdaS)
KMOS(Factor_Analysis_Delta_Cars)
bart_spher(Factor_Analysis_Delta_Cars)

#EFA
scree(Factor_Analysis_Delta_Cars)
#Eigen Values
pca(r,nfactor =10,rotate = F )

z=pca(r,nfactors = 3,method = regression,rotate = "varimax",scores = T)
z

print(z$loadings,digits = 3,cutoff = 0.7)
