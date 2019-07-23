package recommender;

public class RecApp {

    public static void main(String[] args) {
        UserCFRecommender ucf = new UserCFRecommender("C:\\Users\\Danitosh\\Documents\\NetBeansProjects\\UserRecommender\\src\\recommender\\users.txt",
                "C:\\Users\\Danitosh\\Documents\\NetBeansProjects\\UserRecommender\\src\\recommender\\Movie.txt");
        double jaccardSim = ucf.compute_jaccard_sim(0, 3);
        System.out.println("The jaccard similarity between User "
                + ucf.get_users()[0].get_ID() + " and " + ucf.get_users()[3].get_ID() + " = " + jaccardSim);

        System.out.println("Similarity between user " + ucf.get_users()[0].get_ID()
                + " and " + ucf.get_users()[3].get_ID() + " is " + ucf.get_users()[0].similarity(ucf.get_users()[3]));
        double[] n_sim = new double[20];
       
        int []users = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        double [] scores = {3,4,5,6,8,7,4,7,4,8,7,9,8,7,4,5,8,7,8,7};
        ucf.find_user_neighbors(0, 14, users, n_sim);
        ucf.compute_recommendation_scores(0, users,n_sim, scores);
        ucf.make_recommendations();
    }
}
