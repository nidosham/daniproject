package recommender;

import java.util.Arrays;

public class UserCFRecommender extends Recommender {

    public UserCFRecommender() {
    }

    public UserCFRecommender(String ufile, String ifile) {

        this.read_items(ifile);
        this.read_users(ufile);
    }

    //computes the Jaccard similarity between two users give the 
    //indices of both users in the Users[] users list. 
    public double compute_jaccard_sim(int u1_ind, int u2_ind) {
        //1. get n_common_items:      
        int n_common_items = users[u1_ind].similarity(users[u2_ind]);

        //2. get total_n_items using u1 n_items, u2 n_items&n_common_items
        int n_items;
        n_items = (users[u1_ind].get_n_items() + users[u2_ind].get_n_items()) - n_common_items;

        //3. compute Jaccard sim as n_common_items/total_n_items
        double jaccardSim = (double) n_common_items / (double) n_items;

        return jaccardSim;
    }

    //finds the neighbors of a user given the user index in the 
    //Users[] users, and given the number of neighbors
    //returns neighbors indices, and neighbors similarity values
    public void find_user_neighbors(int u_ind, int n_neighbors, int[] n_ind, double[] n_sim) {
        /*
		1. Create an array sim[] with size = n_users to save all similarity
		   values in
        
		2. For each other user u
			compute similarity between u_ind and u by calling the
			compute_jaccard_sim method, and save the result in sim[u]
		3. Scan sim[] and select the "n_neighbors" users with the highest similarities.
			for i = 0 ->n_neighbors -1:
				ind = -1
				max = -1
				for j = 0 ->n_users -1:
					if sim[j]>max:
						max = sim[j]
						ind = j
				save max &ind into n_sim[i] and n_ind[i]
				set sim[ind] = -2
         */
        double[] sim = new double[n_neighbors];
        for (int i = 0; i <= n_neighbors - 1; i++) {
            sim[i] = compute_jaccard_sim(u_ind, n_ind[i]);
        }
        for (int i = 0; i <= n_neighbors - 1; i++) {
            int ind = -1;
            double max = sim[-1];
            for (int j = 0; j <= sim.length - 1; j++) {
                if (sim[j] > max) {
                    max = sim[j];
                    ind = j;
                }
            }
            n_sim[i] = max;
            n_ind[i] = ind;
            sim[ind] = -2;

        }
        System.out.println(" Neighbors " + n_ind.length);
    }

    //
    public void compute_recommendation_scores(int u_ind, int[] n_ind, double[] n_sim, double[] scores) {

        double[] neighbors = new double[5];
        Arrays.sort(n_sim);
        int k = n_ind.length - 1;
        int n = 0;
        for (int i = k; i > k - 5; i--) {//getting five neigbours
            neighbors[n] = n_ind[i];           
          System.out.println("");
        }
    }

    //
    public void make_recommendations() {

        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < users.length; j++) {
                for (int k = 0; k < users[j].get_n_items(); k++) {
                    if (items[i].get_ID() != users[j].get_items()[i]) {
                        System.out.println(users[j].get_ID() + "You may also like " + items[i].get_name());
                    }

                }
            }
        }
    }

}
