#HLB – Health Life Balance

Today, the field of health and wellness mobile apps development is gaining popularity because the number of people using such apps has increased. Here we are proposing an integrated Health and Wellness app named as HLB – Health Life Balance. In this app, we have integrated features such as BMI calculator, diet plan, fitness tracker, yoga demos, home remedies, first aid during emergencies, disease prediction, suggesting nearby healthcare services.
Here we are integrating medication time remainder as a unique feature.
App features:-
1. BMI calculator
The Body Mass Index (BMI) Calculator is integrated in the proposed app to calculate BMI value and corresponding weight status.  The value obtained from the calculation of BMI is used to categorize whether a person is underweight, normal weight, overweight, or obese depending on what range the value falls between. We have considered WHO recommendation (World Health Organization) as bench mark for BMI values in our app.
2. Diet Plan
In this feature we have added two sub features. The first feature is calorie intake calculator and the second one is meal planner.
	In the calorie intake calculator, it accepts height, weight, age and gender, and then calculate the total calories to be consumed in day, as well as it will display the quantity of carbohydrates, fats, proteins to be consumed in a day. We have used Harris - Benedict equation to calculate total calorie consumption in a day. If a person is moderately active, then,
Total calorie intake per day = body energy expenditure * 1.2
where Body energy expenditure is your daily energy expenditure.
	The second sub feature is meal planner. If a user is undergoing any health condition like diabetes, blood pressure, obesity etc. then a separate meal planner is provided for each. This feature is very easy to use because user can choose his meal plan in a single click. This is implemented using recycler view and card view. By using card view we have implemented first activity. In the 2nd activity objects are in the form of jpeg images and image title and image description is passed from first activity to the second activity using intents. Adapters are used for joining the activities to each other.
3. Home remedies
This feature includes a list of home remedies for various infections or diseases and a short description of home remedies for each disease. This feature provides home remedies for each disease in a single click. Similar to diet plan, a list of home remedies is given using recycler view and card view. 
4.Yoga demos
We have implemented Yoga demo as a list of yoga postures as recycler view and card view.  By using card view we have implemented first activity. In the 2nd activity objects are in the form of gif images and image title and image description is passed from first activity to the second activity using intents. Adapters are used for joining the activities to each other. This feature is added with a timer with 30 seconds time span, procedure of each yoga postures and their benefits.
5. First aid during emergencies
This feature includes a list of first aid suggestion for various emergencies such as electric shock, snake bites, breathlessness etc. this feature is quite user friendly because user will get different kinds of first aid information on various situations in a single click. Similar to home remedies, a list of required scenarios is given using recycler view and card view. 
6. Fitness Tracker
We have integrated our fitness tracker using the hardware step-sensor for minimal battery consumption. This app is designed to be kept running all the time without having any impact on your battery life. Unlike other pedometer apps, this app does not track your movement or your location so it doesn't need to turn on your GPS sensor.
7. Medication Time reminder
This feature is implemented to aid the forgetful and busy with remembering to take their daily medications. This feature allows the user to store pill objects and multiple alarms for those pills. Alarms have one time of day and can occur on multiple days of the week. The user is able to view their pills from a calendar view and can select date to view medicines. In addition, it will store the history of when each medication has taken, this will aid the user in keeping track of their medication usage.
8. Disease prediction based on symptoms
Disease prediction feature is helping user to find what health issue is undergoing based on the user’s symptoms. Symptoms are shown using List view and diseases are stored in an array. User can choose the symptoms and it will be compared with the diseases, and the matching disease will be displayed.
9. Suggest nearby hospitals and pharmacies
This feature enables the user to locate nearby hospitals and pharmacies based on the current location of the user on the Google Map by clicking the hospital and pharmacy button respectively. To enable this we are using Maps API and Location API. 

