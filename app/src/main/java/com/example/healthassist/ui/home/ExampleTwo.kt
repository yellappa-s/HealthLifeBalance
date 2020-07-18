package com.example.healthassist.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.healthassist.R

class ExampleTwo : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_two)

        val imageList = listOf<Images>(
            Images(
                R.drawable.healthyperson,
                "Healthy Diet",
                "Have a Balanced Diet\n" +
                        "A healthy eating plan:\n" +
                        "Emphasizes vegetables, fruits, whole grains, and fat-free or low-fat dairy products.\n" +
                        "Includes lean meats, poultry, fish, beans, eggs, and nuts.\n" +
                        "Limits saturated and trans fats, sodium, and added sugars.\n" +
                        "Controls portion sizes.\n\n"
            ),
            Images(
                R.drawable.diabetic,
                "Diabetes",
                "diabetes meal plan\n" +
                        "Breakfast: One poached egg and half a small avocado spread on one slice of Ezekiel bread, one orange. Total carbs: Approximately 39\n" +
                        "\n" +
                        "Lunch: Mexican bowl: two-thirds of a cup low-sodium canned pinto beans, 1 cup chopped spinach, a quarter cup chopped tomatoes, a quarter cup bell peppers, 1 ounce (oz) cheese, 1 tablespoon (tbsp) salsa as sauce. Total carbs: Approximately 30.\n" +
                        "\n" +
                        "Snack: 20 1-gram baby carrots with 2 tbsp hummus. Total carbs: Approximately 21.\n" +
                        "\n" +
                        "Dinner: 1 cup cooked lentil penne pasta, 1.5 cups veggie tomato sauce (cook garlic, mushrooms, greens, zucchini, and eggplant into it), 2 oz ground lean turkey. Total carbs: Approximately 35.\n" +
                        "\n" +
                        "Total carbs for the day: 125.\n"
            ),
            Images(
                R.drawable.bloodpressure,
                "Blood Pressure ",
                "High Blood Pressure\n" +
                        "Walk daily to above 1km\n"+
                        "Add a serving of vegetables at lunch and at dinner.\n" +
                        "Add a serving of fruit to your meals or as a snack. Canned and dried fruits are easy to use, but check that they don't have added sugar.\n" +
                        "Use only half your typical serving of butter, margarine, or salad dressing, and use low-fat or fat-free condiments.\n" +
                        "Drink low-fat or skim dairy products any time you would normally use full-fat or cream.\n" +
                        "Limit meat to 6 ounces a day. Make some meals vegetarian.\n"+
                        "Low Blood Pressure\n"+
                        "Leafy greens. Potassium helps your kidneys get rid of more sodium through your urine. ...\n" +
                        "Berries. Berries, especially blueberries, are rich in natural compounds called flavonoids. ...\n" +
                        "Red beets. ...\n" +
                        "Skim milk and yogurt. \n"

            ),
            Images(
                R.drawable.heartprob,
                "Heart Problem",
                "Follow this every Day"+
                        "Breakfast\n" +
                        "1 cup cooked oatmeal, sprinkled with 1 tablespoon chopped walnuts and 1 teaspoon cinnamon\n" +
                        "1 banana\n" +
                        "1 cup skim milk\n" +
                        "Lunch\n" +
                        "1 cup low-fat (1 percent or lower), plain yogurt with 1 teaspoon ground flaxseed\n" +
                        "1/2 cup peach halves, canned in juice\n" +
                        "5 Melba toast crackers\n" +
                        "1 cup raw broccoli and cauliflower\n" +
                        "2 tablespoons low-fat cream cheese, plain or vegetable flavor (as a spread for crackers or vegetable dip)\n" +
                        "Sparkling water\n" +
                        "Dinner\n" +
                        "4 ounces salmon\n" +
                        "1/2 cup green beans with 1 tablespoon toasted almonds\n" +
                        "2 cups mixed salad greens\n" +
                        "2 tablespoons low-fat salad dressing\n" +
                        "1 tablespoon sunflower seeds\n" +
                        "1 cup skim milk\n" +
                        "1 small orange\n"
            ),
            Images(
                R.drawable.garstric,
                "Acidity/Gastric",
                "Eat on Time\n" +
                        "Some people find that the following foods and drinks help ease symptoms of gastritis:\n" +
                        "\n" +
                        "high-fiber foods, such as whole grains, fruits, vegetables, and beans\n" +
                        "low-fat foods, such as fish, lean meats, and vegetables\n" +
                        "foods with low acidity, including vegetables and beans\n" +
                        "non-carbonated drinks\n" +
                        "caffeine-free drinks\n"
            ),
            Images(
                R.drawable.weightloss,
                "Weight Loss",
                "Have less Carbohydrates:\n" +
                        "Ensure to have all the food groups in your diet plan.\n" +
                        "Breakfasts are to be hearty and wholesome. Options like paratha, idlis, dosa, uttapam, bread and eggs are good choices.\n" +
                        "Breakfast should be taken within thirty minutes of waking up.\n" +
                        "Lunch should be a medium affair with dal, sabzi, roti and curd or rice, rajma, chole etc.\n" +
                        "Dinner should be light such as khichdi or dal chawal or curd rice.\n" +
                        "Dinner should be taken at least two hours before bedtime.\n" +
                        "Apart from the main meals, there should be 2-3 mini meals as well.\n" +
                        "These mini meals can consist of fruits, nuts, salads, peanuts etc.\n" +
                        "Packages, processes, ready to eat foods should be avoided.\n" +
                        "Water is a very important element of a balanced diet.\n" +
                        "One meal a week can be a cheat meal, however, ensure not to go overboard during this time.\n" +
                        "Avoid things like a zero carb diet or starvation to lose weight.\n"
            ),
            Images(
                R.drawable.weightgain1,
                "Weight Gain",
                "Eat more Carbohydrates\n"+
                        "Homemade Protein Smoothies. Drinking homemade protein smoothies can be a highly nutritious and quick way to gain weight. ...\n" +
                        "Milk. Milk has been used as a weight gainer or muscle builder for decades ( 1 ). ...\n" +
                        "Rice. ...\n" +
                        "Nuts and Nut Butters. ...\n" +
                        "Red Meats. ...\n" +
                        "Potatoes and Starches. ...\n" +
                        "Salmon and Oily Fish. ...\n" +
                        "Protein Supplements.\n"
            ))
        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = HomeRemedyAdaptor(this, imageList){
            val intent = Intent(this, FirstAidActivity::class.java)
            intent.putExtra(exampleOne.INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}