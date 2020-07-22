package com.example.healthassist.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.healthassist.R

class ExerciseActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)
        val imagesList = listOf<Image>(
            Image(
                R.drawable.yoga_for_anxeity_disorders,
                R.drawable.healthyone,
                "Yoga for Anxeity Disorders",
                "Yoga eases symptoms of anxiety and stress through direct benefits to both the body and mind. On a physical level, yoga helps induce a relaxation response and reduce heart rate; on a psychological level, mindfulness promotes a focus on the present moment, guiding thoughts away from anxiety or worry about future events."
            ),
            Image(
                R.drawable.yoga_to_reduce_belly,
                R.drawable.healthytwo,
                "Yoga To Reduce Belly/Tummy",
                "This pose will tone your abs and relieve the pain in your lower back. Pavanamukthasana will also tone the hips and the thighs. It improves the health of the stomach and enhances metabolism.\n"+
                        "Practicing yoga may also help you develop muscle tone and improve your metabolism. While restorative yoga isn't an especially physical type of yoga, it still helps in weight loss. One study found that restorative yoga was effective in helping overweight women to lose weight, including abdominal fat"),
            Image(
                R.drawable.yoga_for_breathing,
                R.drawable.heathythree,
                "Yoga for Breathing Problems",
                "Lowers stress and improves cardiovascular function. One of the main benefits of alternate nostril breathing is that it may lower stress. ...\n" +
                        "Improves lung function and respiratory endurance. Yogic breathing practices may improve lung function and respiratory endurance. ...\n" +
                        "Lowers heart rate. ..."
            ),
            Image(
                R.drawable.yoga_for_thyroid2,
                R.drawable.ealthyfour,
                "Yoga for Thyroid",
                "yoga reduces the symptoms of stress and improves overall well-being. Stress is often associated with thyroid problems. For this reason, yoga may be beneficial for thyroid health. ... The underlying cause of hyperthyroidism may be Graves' disease or an overactive thyroid"
            ),
            Image(
                R.drawable.yoga_for_joint_pain,
                R.drawable.ealthyfive,
                "Yoga for Joint Pain",
                "People with various types of arthritis who practice yoga regularly can reduce joint pain, improve joint flexibility and function, and lower stress and tension to promote better sleep. Many people turn to yoga as a way to exercise gently, as well as to reduce tension and improve joint flexibility."
            ),
            Image(
                R.drawable.yoga_for_thyroid,
                R.drawable.healthysix,
                "Yoga for Thyroid",
                "There is a connection between stress and hypothyroidism, but certain yoga poses are thought to balance out thyroids that are either underactive or overactive . ... Keep in mind that these poses cannot cure your thyroid imbalance. Yoga is considered a complementary therapy."
            ),
            Image(
                R.drawable.yoga_for_motion,
                R.drawable.healthyseven,
                "Yoga for Motion ",
                "These poses massage your digestive organs, increase blood flow and oxygen delivery, aid the process of peristalsis, and encourage stools to move through your system. Doing yoga regularly can result in regular, healthy bowel movements."
            ),
            Image(
                R.drawable.yoga_for_shoulders,
                R.drawable.healthyeight,
                "Yoga For Shoulders",
                "Here is a great yoga sequence you can do to open up your upper body. Since we're always schlepping heavy bags, so many of us carry tension in our shoulders and the head and neck region. This sequence helps to release those muscles, strengthen the arms and shoulders, and maintain great posture."
            ),
            Image(
                R.drawable.yogaforweightloss,
                R.drawable.ealthynine,
                "Yoga for Weight Loss",
                "Practicing yoga may also help you develop muscle tone and improve your metabolism. While restorative yoga isn't an especially physical type of yoga, it still helps in weight loss. One study found that restorative yoga was effective in helping overweight women to lose weight, including abdominal fat.."
            ),
            Image(
                R.drawable.yoga_for_nervous,
                R.drawable.healthyten,
                "Yoga For Nervous System",
                "Yoga benefits the central nervous system, strengthens immunity and gives people a sense of focus, new research reveals. Practicing the ancient spiritual exercise reduces anxiety and. It also increases protein and hormone levels that are associated with improved resilience to stress, the research adds\n" + "Begin standing, then step your right foot forward about four feet. With your foot parallel and toes pointing to the top of the mat, bend your knee into a lungs. .\n"
            ),
            Image(
                R.drawable.yogatoimproveflexibility,
                R.drawable.yogaone,
                "Yoga to Improve Flexibilty",
                "Yoga poses stretch your muscles and increase your range of motion.\n" +
                        "With regular flexibilty,you'll improve your flexibility\n "+"You will start to feel the difference in 2 to 4 weeks if you practice 5 days a week. But you will get more flexible over time as you practice all depends the time you spend to practice."),
            Image(
                R.drawable.cold_cough,
                R.drawable.alunomvirom,
                "Yoga For Cold/Cough",
                "Standing Forward Bend (Uttanasana)\n"+
                        " Brings energy to the head and respiratory area; helps clear the sinuses. Stand with your feet hip-width apart and rest your forearms on a chair seat. You can also place a blanket on the chair seat for extra padding. Hold two to five minutes.\n" +
                        "Helps in balancing nervous system "
            )

        )
        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imagesList) {
            val intent = Intent(this, ExampleThreeActivity::class.java)
            intent.putExtra(YogaActivity.INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}
